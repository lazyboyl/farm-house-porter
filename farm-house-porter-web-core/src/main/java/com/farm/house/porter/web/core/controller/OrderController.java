package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/7/31
 * 类描述： 订单的controller
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 功能描述：实现删除订单
     * @param orderId 订单ID
     * @return 返回删除结果
     */
    @PostMapping("removeOrder")
    public ReturnInfo removeOrder(String orderId){
        return orderService.removeOrder(orderId);
    }

    /**
     * 功能描述：取消订单
     * @param orderId 订单ID
     * @return 返回处理结果
     */
    @PostMapping("cancelOrder")
    public ReturnInfo cancelOrder(@RequestParam("orderId")String orderId){
        return orderService.cancelOrder(orderId);
    }

    /**
     * 功能描述：订单列表
     * @param current 当前页面
     * @param pageSize 每页显示条数
     * @param state 订单状态
     * @return 返回查询结果
     */
    @PostMapping("myOrderList")
    public ReturnInfo myOrderList(@RequestParam("current")Integer current,@RequestParam("pageSize")Integer pageSize,@RequestParam("state")String state){
        return orderService.myOrderList(current,pageSize,state);
    }

    /**
     * 功能描述：直接生成订单
     * @param goodId 商品ID
     * @return 返回生成订单的结果
     */
    @PostMapping("directCreation")
    public ReturnInfo directCreation(@RequestParam("goodId")String goodId){
        return orderService.directCreation(goodId);
    }

    /**
     * 功能描述：提交订单
     *
     * @param orderId   订单ID
     * @param addressId 地址ID
     * @param orderNote 订单备注
     * @return 返回提交订单的结果
     */
    @PostMapping("submitOrder")
    public ReturnInfo submitOrder(@RequestParam("orderId")String orderId, @RequestParam("addressId")String addressId,@RequestParam("orderNote")String orderNote){
        return orderService.submitOrder(orderId, addressId, orderNote);
    }

    /**
     * 功能描述：获取生成订单成功
     * @param orderId 订单ID
     * @return 返回查询结果
     */
    @PostMapping("getCreateOrder")
    public ReturnInfo getCreateOrder(@RequestParam("orderId")String orderId){
        return  orderService.getCreateOrder(orderId);
    }

    /**
     * 功能描述：生成订单
     *
     * @param cartIds 购物车的ID集合
     * @return 返回生成订单的结果
     */
    @PostMapping("createOrder")
    public ReturnInfo createOrder(@RequestParam("cartIds")String[] cartIds){
        return orderService.createOrder(cartIds);
    }

}
