package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.constant.OrderConstant;
import com.farm.house.porter.web.core.util.UuidGenId;
import com.farm.house.porter.web.core.vo.OrderVo;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

/**
 * @author linzf
 * @since 2019-07-31
 * 类描述：订单的实体
 */
@Table(name = "t_order")
public class Order {

    public Order(){
        super();
    }

    public Order(OrderVo orderVo,MallUser mallUser,Address address,String orderNote){
        this.createTime = new Date();
        this.state = OrderConstant.ORDER_STATE_WAIT_PAY;
        this.totalPrice = orderVo.getTotalPrice();
        this.crtUserId = mallUser.getUserId();
        this.goodNum = orderVo.getGoodNum();
        this.payState = OrderConstant.ORDER_PAY_STATE_WAIT_PAY;
        this.address = address.getAddressName() + address.getArea();
        this.mobile = address.getMobile();
        this.concatName = address.getName();
        this.orderNote = orderNote;
    }

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
     * 支付状态【1：待支付；5：支付成功；9：支付失败】
     */
    @Column(name = "payState")
    private String payState;

    /**
     * 支付失败原因
     */
    @Column(name = "payFailNote")
    private String payFailNote;

    /**
     * 收货地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 收货电话
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 收货人
     */
    @Column(name = "concatName")
    private String concatName;

    /**
     * 订单备注
     */
    @Column(name = "orderNote")
    private String orderNote;

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getPayFailNote() {
        return payFailNote;
    }

    public void setPayFailNote(String payFailNote) {
        this.payFailNote = payFailNote;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getConcatName() {
        return concatName;
    }

    public void setConcatName(String concatName) {
        this.concatName = concatName;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

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