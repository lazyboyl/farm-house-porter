package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_address")
public class Address {
    /**
     * 地址流水ID
     */
    @Id
    @Column(name = "addressId")
    @KeySql(genId = UuidGenId.class)
    private String addressId;

    /**
     * 详细地址
     */
    @Column(name = "addressName")
    private String addressName;

    /**
     * 联系人
     */
    @Column(name = "name")
    private String name;

    /**
     * 手机号码
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 是否为默认收货地址【1：默认；0：不默认】
     */
    @Column(name = "defaule")
    private String defaule;

    /**
     * 创建时间
     */
    @Column(name = "crtDate")
    private Date crtDate;

    /**
     * 创建人ID
     */
    @Column(name = "crtUserId")
    private String crtUserId;

    /**
     * 更新时间
     */
    @Column(name = "updateDate")
    private Date updateDate;

    /**
     * 更新人ID
     */
    @Column(name = "updateUserId")
    private String updateUserId;

    /**
     * 获取地址流水ID
     *
     * @return addressId - 地址流水ID
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 设置地址流水ID
     *
     * @param addressId 地址流水ID
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取详细地址
     *
     * @return addressName - 详细地址
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * 设置详细地址
     *
     * @param addressName 详细地址
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    /**
     * 获取联系人
     *
     * @return name - 联系人
     */
    public String getName() {
        return name;
    }

    /**
     * 设置联系人
     *
     * @param name 联系人
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取是否为默认收货地址【1：默认；0：不默认】
     *
     * @return defaule - 是否为默认收货地址【1：默认；0：不默认】
     */
    public String getDefaule() {
        return defaule;
    }

    /**
     * 设置是否为默认收货地址【1：默认；0：不默认】
     *
     * @param defaule 是否为默认收货地址【1：默认；0：不默认】
     */
    public void setDefaule(String defaule) {
        this.defaule = defaule;
    }

    /**
     * 获取创建时间
     *
     * @return crtDate - 创建时间
     */
    public Date getCrtDate() {
        return crtDate;
    }

    /**
     * 设置创建时间
     *
     * @param crtDate 创建时间
     */
    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    /**
     * 获取创建人ID
     *
     * @return crtUserId - 创建人ID
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /**
     * 设置创建人ID
     *
     * @param crtUserId 创建人ID
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    /**
     * 获取更新时间
     *
     * @return updateDate - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新人ID
     *
     * @return updateUserId - 更新人ID
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新人ID
     *
     * @param updateUserId 更新人ID
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}