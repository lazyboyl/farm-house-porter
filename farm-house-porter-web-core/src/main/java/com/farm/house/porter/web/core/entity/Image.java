package com.farm.house.porter.web.core.entity;

import javax.persistence.*;

@Table(name = "t_image")
public class Image {
    /**
     * 图片流水ID
     */
    @Id
    @Column(name = "imageId")
    @GeneratedValue(generator = "JDBC")
    private String imageId;

    /**
     * 图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 商品ID
     */
    @Column(name = "goodId")
    private String goodId;

    /**
     * 图片类型【1：展示的图片；2：图文详情】
     */
    @Column(name = "type")
    private String type;

    /**
     * 获取图片流水ID
     *
     * @return imageId - 图片流水ID
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 设置图片流水ID
     *
     * @param imageId 图片流水ID
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
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
     * 获取图片类型【1：展示的图片；2：图文详情】
     *
     * @return type - 图片类型【1：展示的图片；2：图文详情】
     */
    public String getType() {
        return type;
    }

    /**
     * 设置图片类型【1：展示的图片；2：图文详情】
     *
     * @param type 图片类型【1：展示的图片；2：图文详情】
     */
    public void setType(String type) {
        this.type = type;
    }
}