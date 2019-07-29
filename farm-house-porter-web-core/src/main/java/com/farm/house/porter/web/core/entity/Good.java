package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

/**
 * 类描述：商品类
 *
 * @author linzf
 * @since 2019-07-29
 */
@Table(name = "t_good")
public class Good {
    /**
     * 商品流水ID
     */
    @Id
    @Column(name = "goodId")
    @KeySql(genId = UuidGenId.class)
    private String goodId;

    /**
     * 商品名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 优惠价格
     */
    @Column(name = "discountPrice")
    private Double discountPrice;

    /**
     * 商品价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 折扣
     */
    @Column(name = "couponTip")
    private Double couponTip;

    /**
     * 商品库存
     */
    @Column(name = "store")
    private Integer store;

    /**
     * 销量
     */
    @Column(name = "sales")
    private Integer sales;


    /**
     * 默认商品图片地址
     */
    @Column(name = "defaultImage")
    private String defaultImage;

    /**
     * 商品规格保存的数据为JSON格式的数据
     */
    @Column(name = "goodNorms")
    private String goodNorms;

    /**
     * 产品流水ID
     */
    @Column(name = "produceId")
    private String produceId;

    /**
     * 商品状态
     */
    @Column(name = "state")
    private String state;

    /**
     * 发布时间
     */
    @Column(name = "publicTime")
    private Date publicTime;

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
     * 获取优惠价格
     *
     * @return discountPrice - 优惠价格
     */
    public Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 设置优惠价格
     *
     * @param discountPrice 优惠价格
     */
    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取折扣
     *
     * @return couponTip - 折扣
     */
    public Double getCouponTip() {
        return couponTip;
    }

    /**
     * 设置折扣
     *
     * @param couponTip 折扣
     */
    public void setCouponTip(Double couponTip) {
        this.couponTip = couponTip;
    }

    /**
     * 获取商品库存
     *
     * @return store - 商品库存
     */
    public Integer getStore() {
        return store;
    }

    /**
     * 设置商品库存
     *
     * @param store 商品库存
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置销量
     *
     * @param sales 销量
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }


    /**
     * 获取默认商品图片地址
     *
     * @return defaultImage - 默认商品图片地址
     */
    public String getDefaultImage() {
        return defaultImage;
    }

    /**
     * 设置默认商品图片地址
     *
     * @param defaultImage 默认商品图片地址
     */
    public void setDefaultImage(String defaultImage) {
        this.defaultImage = defaultImage;
    }

    /**
     * 获取商品规格保存的数据为JSON格式的数据
     *
     * @return goodNorms - 商品规格保存的数据为JSON格式的数据
     */
    public String getGoodNorms() {
        return goodNorms;
    }

    /**
     * 设置商品规格保存的数据为JSON格式的数据
     *
     * @param goodNorms 商品规格保存的数据为JSON格式的数据
     */
    public void setGoodNorms(String goodNorms) {
        this.goodNorms = goodNorms;
    }

    /**
     * 获取产品流水ID
     *
     * @return produceId - 产品流水ID
     */
    public String getProduceId() {
        return produceId;
    }

    /**
     * 设置产品流水ID
     *
     * @param produceId 产品流水ID
     */
    public void setProduceId(String produceId) {
        this.produceId = produceId;
    }

    /**
     * 获取商品状态
     *
     * @return state - 商品状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置商品状态
     *
     * @param state 商品状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取发布时间
     *
     * @return publicTime - 发布时间
     */
    public Date getPublicTime() {
        return publicTime;
    }

    /**
     * 设置发布时间
     *
     * @param publicTime 发布时间
     */
    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }
}