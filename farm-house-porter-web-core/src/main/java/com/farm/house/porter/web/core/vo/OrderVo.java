package com.farm.house.porter.web.core.vo;


import com.farm.house.porter.web.core.util.UuidUtils;

import java.io.Serializable;
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
