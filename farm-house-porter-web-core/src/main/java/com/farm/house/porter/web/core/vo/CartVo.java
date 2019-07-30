package com.farm.house.porter.web.core.vo;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：购物车的实体VO
 */
public class CartVo {

    /**
     * 购物车流水ID
     */
    private String cartId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品规格描述
     */
    private String attrVal;

    /**
     * 商品价格
     */
    private double price;

    /**
     * 商品优惠价格
     */
    private double discountPrice;

    /**
     * 购买数量
     */
    private Integer number;

    /**
     * 商品ID
     */
    private String goodId;

    /**
     * 商品图片地址
     */
    private String image;

    /**
     * 商品库存
     */
    private Integer store;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}
