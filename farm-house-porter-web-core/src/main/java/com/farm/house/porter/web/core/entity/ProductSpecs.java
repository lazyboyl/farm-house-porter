package com.farm.house.porter.web.core.entity;

import javax.persistence.*;

@Table(name = "t_product_specs")
public class ProductSpecs {
    /**
     * 产品规格表流水ID
     */
    @Id
    @Column(name = "productSpecsId")
    @GeneratedValue(generator = "JDBC")
    private String productSpecsId;

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
     * 获取产品规格表流水ID
     *
     * @return productSpecsId - 产品规格表流水ID
     */
    public String getProductSpecsId() {
        return productSpecsId;
    }

    /**
     * 设置产品规格表流水ID
     *
     * @param productSpecsId 产品规格表流水ID
     */
    public void setProductSpecsId(String productSpecsId) {
        this.productSpecsId = productSpecsId;
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