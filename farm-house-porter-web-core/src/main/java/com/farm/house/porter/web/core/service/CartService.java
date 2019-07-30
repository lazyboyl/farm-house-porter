package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.dao.CartDao;
import com.farm.house.porter.web.core.dao.GoodDao;
import com.farm.house.porter.web.core.entity.Cart;
import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.entity.MallUser;
import com.farm.house.porter.web.core.util.MallUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：购物车的service类
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class CartService {

    /**
     * 购物车的dao
     */
    @Autowired
    private CartDao cartDao;

    /**
     * 商品的dao
     */
    @Autowired
    private GoodDao goodDao;

    /**
     * 功能描述：删除购物车的数据
     * @param cartIds 购物车ID集合
     * @return 返回删除结果
     */
    public ReturnInfo clearCart(String [] cartIds){
        if (cartIds.length ==0 ){
            return new ReturnInfo(SystemStaticConst.FAIL, "请选择需要删除的购物车数据！");
        }
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        for(String cartId: cartIds){
            cartDao.clearCart(cartId,mallUser.getUserId());
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "购物车数据删除成功！");
    }

    /**
     * 功能描述：获取我的购物车列表
     * @return 返回查询结果
     */
    public ReturnInfo getMyCartList(){
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取购物车列表成功！",cartDao.getMyCartList(mallUser.getUserId()));
    }

    /**
     * 功能描述：添加商品到购物车
     *
     * @param goodId 商品UD
     * @return 返回添加结果
     */
    public ReturnInfo addToCart(String goodId) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        Good good = goodDao.selectByPrimaryKey(goodId);
        if (good == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此商品数据！");
        }
        Cart cart = cartDao.getCartByGoodIdAndUserId(good.getGoodId(), mallUser.getUserId());
        // 为null说明购物车中是没有数据，反之是有数据的
        if (cart == null) {
            cartDao.insert(new Cart(good, mallUser));
        } else {
            if(cart.getNumber()> good.getStore() - 1){
                return new ReturnInfo(SystemStaticConst.FAIL, "购物车商品已经到库存上限了！");
            }
            cart.setNumber(cart.getNumber()+1);
            cartDao.updateByPrimaryKey(cart);
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "添加商品到购物车成功！");
    }

}
