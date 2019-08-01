package com.farm.house.porter.web.core.vo;


import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.util.UuidUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linzf
 * @since 2019/7/31
 * 类描述：订单的VO
 */
public class OrderVo implements Serializable {

    private static final long serialVersionUID = 4920895054217922224L;

    public OrderVo() {
        super();
    }

    public OrderVo(Good good){
        this.orderId = UuidUtils.getUUID();
        this.discountPrice = good.getPrice() - good.getDiscountPrice();
        this.totalPrice = good.getDiscountPrice();
        this.goodNum = 1;
        List<CartVo> cartVoList = new ArrayList<>();
        CartVo cartVo = new CartVo();
        cartVo.setTitle(good.getTitle());
        cartVo.setAttrVal(good.getGoodNorms());
        cartVo.setDiscountPrice(good.getDiscountPrice());
        cartVo.setGoodId(good.getGoodId());
        cartVo.setImage(good.getDefaultImage());
        cartVo.setNumber(1);
        cartVo.setPrice(good.getPrice());
        cartVo.setStore(good.getStore());
        cartVoList.add(cartVo);
        this.cartVoList = cartVoList;
    }

    public OrderVo(List<CartVo> cartVoList) {
        this.orderId = UuidUtils.getUUID();
        // 商品总价
        Double totalPrice = 0.0;
        // 优惠金额
        Double discountPrice = 0.0;
        // 总的件数
        Integer goodNum = 0;
        for (CartVo cartVo : cartVoList) {
            totalPrice += cartVo.getDiscountPrice() * cartVo.getNumber();
            goodNum += cartVo.getNumber();
            discountPrice += cartVo.getPrice() * cartVo.getNumber();
        }
        discountPrice = discountPrice - totalPrice;
        this.discountPrice = discountPrice;
        this.totalPrice = totalPrice;
        this.goodNum = goodNum;
        this.cartVoList = cartVoList;
    }


    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 订单总价
     */
    private Double totalPrice;

    /**
     * 优惠金额
     */
    private Double discountPrice;

    /**
     * 商品件数
     */
    private Integer goodNum;

    /**
     * 订单的购物车明细
     */
    private List<CartVo> cartVoList;

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public List<CartVo> getCartVoList() {
        return cartVoList;
    }

    public void setCartVoList(List<CartVo> cartVoList) {
        this.cartVoList = cartVoList;
    }
}
