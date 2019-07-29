package com.farm.house.porter.web.core.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：
 */
@Table(name = "t_category")
public class Category {

    /**
     * 分类流水ID
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 父流水ID
     */
    @Column(name = "pId")
    private Integer pId;

    /**
     * 图片地址
     */
    @Column(name = "picture")
    private String picture;

    /**
     * 图片名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 图片路径
     */
    @Column(name = "fullPath")
    private String fullPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
}
