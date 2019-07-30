package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product")
public class Product {
    /**
     * 产品流水ID
     */
    @Id
    @Column(name = "productId")
    @KeySql(genId = UuidGenId.class)
    private String productId;

    /**
     * 产品名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 产品类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 总销量
     */
    @Column(name = "totalSales")
    private Integer totalSales;

    /**
     * 浏览量
     */
    @Column(name = "pageViews")
    private Integer pageViews;

    /**
     * 产品状态
     */
    @Column(name = "state")
    private String state;

    /**
     * 产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]
     */
    @Column(name = "specsJson")
    private String specsJson;

    /**
     * 创建时间
     */
    @Column(name = "crtDate")
    private Date crtDate;

    /**
     * 商品ID
     */
    @Column(name = "goodId")
    private String goodId;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    /**
     * 获取产品流水ID
     *
     * @return productId - 产品流水ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品流水ID
     *
     * @param productId 产品流水ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取产品名称
     *
     * @return title - 产品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置产品名称
     *
     * @param title 产品名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取产品类型
     *
     * @return type - 产品类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置产品类型
     *
     * @param type 产品类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取产品状态
     *
     * @return state - 产品状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置产品状态
     *
     * @param state 产品状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]
     *
     * @return specsJson - 产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]
     */
    public String getSpecsJson() {
        return specsJson;
    }

    /**
     * 设置产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]
     *
     * @param specsJson 产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]
     */
    public void setSpecsJson(String specsJson) {
        this.specsJson = specsJson;
    }

    /**
     * @return crtDate
     */
    public Date getCrtDate() {
        return crtDate;
    }

    /**
     * @param crtDate
     */
    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }
}