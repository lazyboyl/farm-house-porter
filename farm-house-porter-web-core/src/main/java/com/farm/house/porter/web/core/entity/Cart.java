package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Table(name = "t_cart")
public class Cart {
    /**
     * 购物车流水ID
     */
    @Id
    @Column(name = "cartId")
    @KeySql(genId = UuidGenId.class)
    private String cartId;

    /**
     * 商品标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 商品规格描述
     */
    @Column(name = "attrVal")
    private String attrVal;

    /**
     * 商品价格
     */
    @Column(name = "price")
    private Double price;

    /**
     * 购买数量
     */
    @Column(name = "number")
    private Integer number;

    /**
     * 商品ID
     */
    @Column(name = "goodId")
    private String goodId;

    /**
     * 商品图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 所属用户ID
     */
    @Column(name = "crtUserId")
    private String crtUserId;

    /**
     * 获取购物车流水ID
     *
     * @return cartId - 购物车流水ID
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * 设置购物车流水ID
     *
     * @param cartId 购物车流水ID
     */
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取商品标题
     *
     * @return title - 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品标题
     *
     * @param title 商品标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品规格描述
     *
     * @return attrVal - 商品规格描述
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * 设置商品规格描述
     *
     * @param attrVal 商品规格描述
     */
    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
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
     * 获取商品ID
     *
     * @return goodId - 商品ID
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * 设置商品ID
     *
     * @param goodId 商品ID
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    /**
     * 获取商品图片地址
     *
     * @return image - 商品图片地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置商品图片地址
     *
     * @param image 商品图片地址
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取所属用户ID
     *
     * @return crtUserId - 所属用户ID
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /**
     * 设置所属用户ID
     *
     * @param crtUserId 所属用户ID
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }
}