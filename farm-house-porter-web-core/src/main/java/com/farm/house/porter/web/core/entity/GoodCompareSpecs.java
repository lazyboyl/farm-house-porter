package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Table(name = "t_good_compare_specs")
public class GoodCompareSpecs {
    /**
     * 商品与规格的对照关系流水ID
     */
    @Id
    @Column(name = "goodCompareSpecsId")
    @KeySql(genId = UuidGenId.class)
    private String goodCompareSpecsId;

    /**
     * 商品ID
     */
    @Column(name = "goodId")
    private String goodId;

    /**
     * 产品ID
     */
    @Column(name = "productId")
    private String productId;

    /**
     * 规格信息
     */
    @Column(name = "specs")
    private String specs;

    /**
     * 获取商品与规格的对照关系流水ID
     *
     * @return goodCompareSpecsId - 商品与规格的对照关系流水ID
     */
    public String getGoodCompareSpecsId() {
        return goodCompareSpecsId;
    }

    /**
     * 设置商品与规格的对照关系流水ID
     *
     * @param goodCompareSpecsId 商品与规格的对照关系流水ID
     */
    public void setGoodCompareSpecsId(String goodCompareSpecsId) {
        this.goodCompareSpecsId = goodCompareSpecsId;
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

    /**
     * 获取规格信息
     *
     * @return specs - 规格信息
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * 设置规格信息
     *
     * @param specs 规格信息
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }
}