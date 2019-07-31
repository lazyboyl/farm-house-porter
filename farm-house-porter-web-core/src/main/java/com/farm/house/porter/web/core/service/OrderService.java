package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.dao.*;
import com.farm.house.porter.web.core.entity.Address;
import com.farm.house.porter.web.core.entity.MallUser;
import com.farm.house.porter.web.core.entity.Order;
import com.farm.house.porter.web.core.entity.OrderDetail;
import com.farm.house.porter.web.core.util.MallUserInfo;
import com.farm.house.porter.web.core.util.RedisCache;
import com.farm.house.porter.web.core.vo.CartVo;
import com.farm.house.porter.web.core.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author linzf
 * @since 2019/7/31
 * 类描述：订单的service
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class OrderService {

    /**
     * 订单的dao
     */
    @Autowired
    private OrderDao orderDao;

    /**
     * 订单明细的dao
     */
    @Autowired
    private OrderDetailDao orderDetailDao;

    /**
     * 购物车的dao
     */
    @Autowired
    private CartDao cartDao;

    /**
     * 地址的dao
     */
    @Autowired
    private AddressDao addressDao;

    /**
     * 商品的dao
     */
    @Autowired
    private GoodDao goodDao;

    /**
     * redis的bean
     */
    @Autowired
    private RedisCache redisCache;

    /**
     * 功能描述：提交订单
     *
     * @param orderId   订单ID
     * @param addressId 地址ID
     * @param orderNote 订单备注
     * @return 返回提交订单的结果
     */
    public ReturnInfo submitOrder(String orderId, String addressId,String orderNote) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        OrderVo orderVo = redisCache.getObject(orderId, OrderVo.class);
        if (orderVo == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此订单数据！");
        }
        Address address = addressDao.selectByPrimaryKey(addressId);
        if (address == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此地址数据！");
        }
        // 保存订单数据
        Order order = new Order(orderVo,mallUser,address,orderNote);
        orderDao.insert(order);
        // 保存订单明细数据，同时删除购物车数据
        List<CartVo> cartVoList = orderVo.getCartVoList();
        OrderDetail orderDetail = null;
        for(CartVo cartVo:cartVoList){
            // 新增订单明细数据
            orderDetail = new OrderDetail(cartVo,order);
            orderDetailDao.insert(orderDetail);
            // 若是由商品页面直接提交的订单是没有购物车ID的，因此不需要删除购物车
            if(cartVo.getCartId()!=null && !"".equals(cartVo.getCartId())){
                // 删除购物车数据
                cartDao.deleteByPrimaryKey(cartVo.getCartId());
            }
            // 减少商品库存
            goodDao.reduceGoodStore(cartVo.getNumber(),cartVo.getGoodId());
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "提交订单成功！");
    }

    /**
     * 功能描述：获取生成订单成功
     *
     * @param orderId 订单ID
     * @return 返回查询结果
     */
    public ReturnInfo getCreateOrder(String orderId) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        OrderVo orderVo = redisCache.getObject(orderId, OrderVo.class);
        if (orderVo == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此订单数据！");
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取生成订单成功！", orderVo);
    }

    /**
     * 功能描述：生成订单
     *
     * @param cartIds 购物车的ID集合
     * @return 返回生成订单的结果
     */
    public ReturnInfo createOrder(String[] cartIds) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        List<CartVo> cartVoList = cartDao.getCartVoList(cartIds, mallUser.getUserId());
        if (cartVoList.size() == 0) {
            return new ReturnInfo(SystemStaticConst.FAIL, "提交的购物车不能为空！");
        }
        OrderVo orderVo = new OrderVo(cartVoList);
        redisCache.setObject(orderVo.getOrderId(), orderVo, 1800);
        return new ReturnInfo(SystemStaticConst.SUCCESS, "生成订单成功！", orderVo.getOrderId());
    }

}
