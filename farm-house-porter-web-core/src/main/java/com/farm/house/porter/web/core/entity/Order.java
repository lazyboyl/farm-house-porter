package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class Order {
    /**
     * 订单流水ID
     */
    @Id
    @Column(name = "orderId")
    @KeySql(genId = UuidGenId.class)
    private String orderId;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 付款时间
     */
    @Column(name = "payTime")
    private Date payTime;

    /**
     * 运输时间
     */
    @Column(name = "transportTime")
    private Date transportTime;

    /**
     * 订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     */
    @Column(name = "state")
    private String state;

    /**
     * 订单明细ID
     */
    @Column(name = "orderDetailId")
    private String orderDetailId;

    /**
     * 商品总价
     */
    @Column(name = "totalPrice")
    private Double totalPrice;

    /**
     * 订单创建人ID
     */
    @Column(name = "crtUserId")
    private String crtUserId;

    /**
     * 商品件数
     */
    @Column(name = "goodNum")
    private Integer goodNum;

    /**
     * 支付类型【1：微信；2：支付宝】
     */
    @Column(name = "payType")
    private String payType;

    /**
     * 获取订单流水ID
     *
     * @return orderId - 订单流水ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单流水ID
     *
     * @param orderId 订单流水ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取付款时间
     *
     * @return payTime - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取运输时间
     *
     * @return transportTime - 运输时间
     */
    public Date getTransportTime() {
        return transportTime;
    }

    /**
     * 设置运输时间
     *
     * @param transportTime 运输时间
     */
    public void setTransportTime(Date transportTime) {
        this.transportTime = transportTime;
    }

    /**
     * 获取订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     *
     * @return state - 订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     */
    public String getState() {
        return state;
    }

    /**
     * 设置订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     *
     * @param state 订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取订单明细ID
     *
     * @return orderDetailId - 订单明细ID
     */
    public String getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置订单明细ID
     *
     * @param orderDetailId 订单明细ID
     */
    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获取商品总价
     *
     * @return totalPrice - 商品总价
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置商品总价
     *
     * @param totalPrice 商品总价
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取订单创建人ID
     *
     * @return crtUserId - 订单创建人ID
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /**
     * 设置订单创建人ID
     *
     * @param crtUserId 订单创建人ID
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    /**
     * 获取商品件数
     *
     * @return goodNum - 商品件数
     */
    public Integer getGoodNum() {
        return goodNum;
    }

    /**
     * 设置商品件数
     *
     * @param goodNum 商品件数
     */
    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    /**
     * 获取支付类型【1：微信；2：支付宝】
     *
     * @return payType - 支付类型【1：微信；2：支付宝】
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付类型【1：微信；2：支付宝】
     *
     * @param payType 支付类型【1：微信；2：支付宝】
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }
}