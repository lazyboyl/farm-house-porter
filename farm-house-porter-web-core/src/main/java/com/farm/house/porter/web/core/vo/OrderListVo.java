package com.farm.house.porter.web.core.vo;

import com.farm.house.porter.web.core.entity.OrderDetail;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author linzf
 * @since 2019/8/1
 * 类描述：订单列表的实体类
 */
public class OrderListVo {


    /**
     * 订单流水ID
     */
    private String orderId;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 运输时间
     */
    private Date transportTime;

    /**
     * 订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】
     */
    private String state;

    /**
     * 商品总价
     */
    private Double totalPrice;

    /**
     * 商品件数
     */
    private Integer goodNum;

    /**
     * 订单明细的数据
     */
    private List<OrderDetail> orderDetail;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTransportTime() {
        return transportTime;
    }

    public void setTransportTime(Date transportTime) {
        this.transportTime = transportTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }
}
