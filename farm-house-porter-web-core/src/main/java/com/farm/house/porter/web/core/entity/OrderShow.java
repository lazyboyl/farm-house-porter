package com.farm.house.porter.web.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_show")
public class OrderShow {
    /**
     * 晒单流水ID
     */
    @Id
    @Column(name = "showId")
    @GeneratedValue(generator = "JDBC")
    private String showId;

    /**
     * 订单流水ID
     */
    @Column(name = "orderId")
    private String orderId;

    /**
     * 订单明细流水ID
     */
    @Column(name = "orderDetailId")
    private String orderDetailId;

    /**
     * 商品流水ID
     */
    @Column(name = "goodId")
    private String goodId;

    /**
     * 商品名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 评价星级
     */
    @Column(name = "start")
    private String start;

    /**
     * 评价状态【1：待评价；5：已完成评价；】
     */
    @Column(name = "state")
    private String state;

    /**
     * 评价人流水ID
     */
    @Column(name = "showUserId")
    private String showUserId;

    /**
     * 图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 商品规格
     */
    @Column(name = "attr")
    private String attr;

    /**
     * 评价内容
     */
    @Column(name = "showNote")
    private String showNote;

    /**
     * 评价时间
     */
    @Column(name = "showDate")
    private Date showDate;

    /**
     * 产品ID
     */
    @Column(name = "productId")
    private String productId;

    /**
     * 获取晒单流水ID
     *
     * @return showId - 晒单流水ID
     */
    public String getShowId() {
        return showId;
    }

    /**
     * 设置晒单流水ID
     *
     * @param showId 晒单流水ID
     */
    public void setShowId(String showId) {
        this.showId = showId;
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
     * 获取订单明细流水ID
     *
     * @return orderDetailId - 订单明细流水ID
     */
    public String getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置订单明细流水ID
     *
     * @param orderDetailId 订单明细流水ID
     */
    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获取商品流水ID
     *
     * @return goodId - 商品流水ID
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * 设置商品流水ID
     *
     * @param goodId 商品流水ID
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    /**
     * 获取商品名称
     *
     * @return title - 商品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名称
     *
     * @param title 商品名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取评价星级
     *
     * @return start - 评价星级
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置评价星级
     *
     * @param start 评价星级
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * 获取评价状态【1：待评价；5：已完成评价；】
     *
     * @return state - 评价状态【1：待评价；5：已完成评价；】
     */
    public String getState() {
        return state;
    }

    /**
     * 设置评价状态【1：待评价；5：已完成评价；】
     *
     * @param state 评价状态【1：待评价；5：已完成评价；】
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取评价人流水ID
     *
     * @return showUserId - 评价人流水ID
     */
    public String getShowUserId() {
        return showUserId;
    }

    /**
     * 设置评价人流水ID
     *
     * @param showUserId 评价人流水ID
     */
    public void setShowUserId(String showUserId) {
        this.showUserId = showUserId;
    }

    /**
     * 获取图片地址
     *
     * @return image - 图片地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片地址
     *
     * @param image 图片地址
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取商品规格
     *
     * @return attr - 商品规格
     */
    public String getAttr() {
        return attr;
    }

    /**
     * 设置商品规格
     *
     * @param attr 商品规格
     */
    public void setAttr(String attr) {
        this.attr = attr;
    }

    /**
     * 获取评价内容
     *
     * @return showNote - 评价内容
     */
    public String getShowNote() {
        return showNote;
    }

    /**
     * 设置评价内容
     *
     * @param showNote 评价内容
     */
    public void setShowNote(String showNote) {
        this.showNote = showNote;
    }

    /**
     * 获取评价时间
     *
     * @return showDate - 评价时间
     */
    public Date getShowDate() {
        return showDate;
    }

    /**
     * 设置评价时间
     *
     * @param showDate 评价时间
     */
    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    /**
     * 获取产品ID
     *
     * @return productId - 产品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品ID
     *
     * @param productId 产品ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
}