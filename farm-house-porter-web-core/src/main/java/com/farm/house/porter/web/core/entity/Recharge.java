package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge")
public class Recharge {
    /**
     * 充值流水ID
     */
    @Id
    @Column(name = "rechargeId")
    @KeySql(genId = UuidGenId.class)
    private String rechargeId;

    /**
     * 充值金额
     */
    @Column(name = "money")
    private Double money;

    /**
     * 充值时间
     */
    @Column(name = "rechargeDate")
    private Date rechargeDate;

    /**
     * 充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】
     */
    @Column(name = "state")
    private String state;

    /**
     * 获取充值流水ID
     *
     * @return rechargeId - 充值流水ID
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * 设置充值流水ID
     *
     * @param rechargeId 充值流水ID
     */
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    /**
     * 获取充值金额
     *
     * @return money - 充值金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置充值金额
     *
     * @param money 充值金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取充值时间
     *
     * @return rechargeDate - 充值时间
     */
    public Date getRechargeDate() {
        return rechargeDate;
    }

    /**
     * 设置充值时间
     *
     * @param rechargeDate 充值时间
     */
    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    /**
     * 获取充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】
     *
     * @return state - 充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】
     */
    public String getState() {
        return state;
    }

    /**
     * 设置充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】
     *
     * @param state 充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】
     */
    public void setState(String state) {
        this.state = state;
    }
}