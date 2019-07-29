package com.farm.house.porter.web.core.vo;

import com.farm.house.porter.web.core.entity.DescInfo;
import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.entity.Image;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-29
 * 类描述：商品信息的vo类
 */
public class GoodInfoVo {

    public GoodInfoVo() {
        super();
    }

    public GoodInfoVo(Good good) {
       this.goodId = good.getGoodId();
       this.title = good.getTitle();
       this.price = good.getPrice();
       this.discountPrice = good.getDiscountPrice();
       this.couponTip = good.getCouponTip();
       this.store = good.getStore();
       this.sales = good.getSales();
       this.goodNorms = good.getGoodNorms();
    }

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
    private Double price;

    /**
     * 商品优惠价格
     */
    private Double discountPrice;

    /**
     * 商品折扣
     */
    private Double couponTip;

    /**
     * 商品库存
     */
    private Integer store;

    /**
     * 商品销量
     */
    private Integer sales;

    /**
     * 商品浏览量
     */
    private Integer pageViews;

    /**
     * 购买类型
     */
    private String specsJson;

    /**
     * 商品规格
     */
    private String goodNorms;

    /**
     * 轮播图文
     */
    private List<Image> carouselImagesList;


    /**
     * 图文详情
     */
    private List<DescInfo> goodImages;

    public String getGoodNorms() {
        return goodNorms;
    }

    public void setGoodNorms(String goodNorms) {
        this.goodNorms = goodNorms;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Double getCouponTip() {
        return couponTip;
    }

    public void setCouponTip(Double couponTip) {
        this.couponTip = couponTip;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    public String getSpecsJson() {
        return specsJson;
    }

    public void setSpecsJson(String specsJson) {
        this.specsJson = specsJson;
    }

    public List<Image> getCarouselImagesList() {
        return carouselImagesList;
    }

    public void setCarouselImagesList(List<Image> carouselImagesList) {
        this.carouselImagesList = carouselImagesList;
    }

    public List<DescInfo> getGoodImages() {
        return goodImages;
    }

    public void setGoodImages(List<DescInfo> goodImages) {
        this.goodImages = goodImages;
    }
}