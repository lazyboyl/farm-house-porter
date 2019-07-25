package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Table(name = "t_desc_info")
public class DescInfo {
    /**
     * 流水ID
     */
    @Id
    @Column(name = "descImageId")
    @KeySql(genId = UuidGenId.class)
    private String descImageId;

    /**
     * 产品流水ID
     */
    @Column(name = "productId")
    private String productId;

    /**
     * 图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 获取流水ID
     *
     * @return descImageId - 流水ID
     */
    public String getDescImageId() {
        return descImageId;
    }

    /**
     * 设置流水ID
     *
     * @param descImageId 流水ID
     */
    public void setDescImageId(String descImageId) {
        this.descImageId = descImageId;
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
     * 获取图片地址
     *
     * @return image - 图片地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片地址
     *
     * @param image 图片地址
     */
    public void setImage(String image) {
        this.image = image;
    }
}