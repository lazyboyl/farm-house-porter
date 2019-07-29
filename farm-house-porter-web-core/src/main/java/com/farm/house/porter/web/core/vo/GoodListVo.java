package com.farm.house.porter.web.core.vo;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：商品列表的VO
 */
public class GoodListVo {

    /**
     * 商品ID
     */
    private String goodId;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品价格
     */
    private double price;

    /**
     * 商品总销量
     */
    private Integer totalSales;

    /**
     * 商品图片地址
     */
    private String image;


    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
