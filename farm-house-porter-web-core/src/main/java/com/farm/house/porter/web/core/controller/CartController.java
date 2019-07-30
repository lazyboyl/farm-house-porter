package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：购物车的controller
 */
@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 功能描述：删除购物车的数据
     * @param cartIds 购物车ID集合
     * @return 返回删除结果
     */
    @PostMapping("clearCart")
    public ReturnInfo clearCart(@RequestParam("cartIds")String [] cartIds){
        return cartService.clearCart(cartIds);
    }

    /**
     * 功能描述：获取我的购物车列表
     * @return 返回查询结果
     */
    @PostMapping("getMyCartList")
    public ReturnInfo getMyCartList(){
        return cartService.getMyCartList();
    }

    /**
     * 功能描述：添加商品到购物车
     *
     * @param goodId 商品UD
     * @return 返回添加结果
     */
    @PostMapping("addToCart")
    public ReturnInfo addToCart(@RequestParam("goodId")String goodId) {
        return cartService.addToCart(goodId);
    }

}
