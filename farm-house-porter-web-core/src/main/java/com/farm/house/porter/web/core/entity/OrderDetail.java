package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import com.farm.house.porter.web.core.vo.CartVo;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

/**
 * @author linzf
 * @since 2019-07-31
 * 类描述：订单明细的实体类
 */
@Table(name = "t_order_detail")
public class OrderDetail {

    public OrderDetail(){
        super();
    }

    public OrderDetail(CartVo cartVo,Order order){
        this.title = cartVo.getTitle();
        this.attr = cartVo.getAttrVal();
        this.detailPrice = cartVo.getDiscountPrice() * cartVo.getNumber();
        this.goodId = cartVo.getGoodId();
        this.image = cartVo.getImage();
        this.number = cartVo.getNumber();
        this.price = cartVo.getDiscountPrice();
        this.orderId = order.getOrderId();
    }

    /**
     * 订单明细流水ID
     */
    @Id
    @Column(name = "orderDetailId")
    @KeySql(genId = UuidGenId.class)
    private String orderDetailId;

    /**
     * 商品名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 商品单价
     */
    @Column(name = "price")
    private Double price;

    /**
     * 商品图片
     */
    @Column(name = "image")
    private String image;

    /**
     * 购买数量
     */
    @Column(name = "number")
    private Integer number;

    /**
     * 订单明细总价
     */
    @Column(name = "detailPrice")
    private Double detailPrice;

    /**
     * 商品规格
     */
    @Column(name = "attr")
    private String attr;

    /**
     * 商品流水ID
     */
    @Column(name = "goodId")
    private String goodId;

    /**
     * 订单ID
     */
    @Column(name = "orderId")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

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
     * 获取商品单价
     *
     * @return price - 商品单价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置商品单价
     *
     * @param price 商品单价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取商品图片
     *
     * @return image - 商品图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置商品图片
     *
     * @param image 商品图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取购买数量
     *
     * @return number - 购买数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置购买数量
     *
     * @param number 购买数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取订单明细总价
     *
     * @return detailPrice - 订单明细总价
     */
    public Double getDetailPrice() {
        return detailPrice;
    }

    /**
     * 设置订单明细总价
     *
     * @param detailPrice 订单明细总价
     */
    public void setDetailPrice(Double detailPrice) {
        this.detailPrice = detailPrice;
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
}