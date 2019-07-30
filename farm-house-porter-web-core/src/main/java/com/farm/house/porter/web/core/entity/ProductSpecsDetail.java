package com.farm.house.porter.web.core.entity;

import javax.persistence.*;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：产品规格明细的类
 */
@Table(name = "t_product_specs_detail")
public class ProductSpecsDetail {
    /**
     * 产品规格明细表流水ID
     */
    @Id
    @Column(name = "productSpecsDetailId")
    @GeneratedValue(generator = "JDBC")
    private String productSpecsDetailId;

    /**
     * 产品ID
     */
    @Column(name = "productId")
    private String productId;

    /**
     * 产品规格表流水ID
     */
    @Column(name = "productSpecsId")
    private String productSpecsId;

    /**
     * 产品规格明细名称
     */
    @Column(name = "productSpecsDetailName")
    private String productSpecsDetailName;

    /**
     * 获取产品规格明细表流水ID
     *
     * @return productSpecsDetailId - 产品规格明细表流水ID
     */
    public String getProductSpecsDetailId() {
        return productSpecsDetailId;
    }

    /**
     * 设置产品规格明细表流水ID
     *
     * @param productSpecsDetailId 产品规格明细表流水ID
     */
    public void setProductSpecsDetailId(String productSpecsDetailId) {
        this.productSpecsDetailId = productSpecsDetailId;
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
     * 获取产品规格明细名称
     *
     * @return productSpecsDetailName - 产品规格明细名称
     */
    public String getProductSpecsDetailName() {
        return productSpecsDetailName;
    }

    /**
     * 设置产品规格明细名称
     *
     * @param productSpecsDetailName 产品规格明细名称
     */
    public void setProductSpecsDetailName(String productSpecsDetailName) {
        this.productSpecsDetailName = productSpecsDetailName;
    }
}