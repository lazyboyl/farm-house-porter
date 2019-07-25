package com.farm.house.porter.web.core.entity;

import com.farm.house.porter.web.core.util.UuidGenId;
import tk.mybatis.mapper.annotation.KeySql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_consume_detail")
public class ConsumerDetail {
    /**
     * 消费明细流水ID
     */
    @Id
    @Column(name = "consumeDetaiId")
    @KeySql(genId = UuidGenId.class)
    private String consumeDetaiId;

    /**
     * 消费类型【1：充值；2：购物】
     */
    @Column(name = "type")
    private String type;

    /**
     * 金额
     */
    @Column(name = "money")
    private Double money;

    /**
     * 消费时间
     */
    @Column(name = "consumeDate")
    private Date consumeDate;

    /**
     * 状态【0：消费失败；1：正常；】
     */
    @Column(name = "state")
    private String state;

    /**
     * 消费用户流水ID
     */
    @Column(name = "crtUserId")
    private String crtUserId;

    /**
     * 关联订单ID
     */
    @Column(name = "orderId")
    private String orderId;

    /**
     * 充值订单ID
     */
    @Column(name = "rechargeId")
    private String rechargeId;

    /**
     * 消费前账户金额
     */
    @Column(name = "amountBefore")
    private Double amountBefore;

    /**
     * 消费后账户金额
     */
    @Column(name = "amountAfter")
    private Double amountAfter;

    /**
     * 获取消费明细流水ID
     *
     * @return consumeDetaiId - 消费明细流水ID
     */
    public String getConsumeDetaiId() {
        return consumeDetaiId;
    }

    /**
     * 设置消费明细流水ID
     *
     * @param consumeDetaiId 消费明细流水ID
     */
    public void setConsumeDetaiId(String consumeDetaiId) {
        this.consumeDetaiId = consumeDetaiId;
    }

    /**
     * 获取消费类型【1：充值；2：购物】
     *
     * @return type - 消费类型【1：充值；2：购物】
     */
    public String getType() {
        return type;
    }

    /**
     * 设置消费类型【1：充值；2：购物】
     *
     * @param type 消费类型【1：充值；2：购物】
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取消费时间
     *
     * @return consumeDate - 消费时间
     */
    public Date getConsumeDate() {
        return consumeDate;
    }

    /**
     * 设置消费时间
     *
     * @param consumeDate 消费时间
     */
    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    /**
     * 获取状态【0：消费失败；1：正常；】
     *
     * @return state - 状态【0：消费失败；1：正常；】
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态【0：消费失败；1：正常；】
     *
     * @param state 状态【0：消费失败；1：正常；】
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取消费用户流水ID
     *
     * @return crtUserId - 消费用户流水ID
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /**
     * 设置消费用户流水ID
     *
     * @param crtUserId 消费用户流水ID
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    /**
     * 获取关联订单ID
     *
     * @return orderId - 关联订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置关联订单ID
     *
     * @param orderId 关联订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取充值订单ID
     *
     * @return rechargeId - 充值订单ID
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * 设置充值订单ID
     *
     * @param rechargeId 充值订单ID
     */
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    /**
     * 获取消费前账户金额
     *
     * @return amountBefore - 消费前账户金额
     */
    public Double getAmountBefore() {
        return amountBefore;
    }

    /**
     * 设置消费前账户金额
     *
     * @param amountBefore 消费前账户金额
     */
    public void setAmountBefore(Double amountBefore) {
        this.amountBefore = amountBefore;
    }

    /**
     * 获取消费后账户金额
     *
     * @return amountAfter - 消费后账户金额
     */
    public Double getAmountAfter() {
        return amountAfter;
    }

    /**
     * 设置消费后账户金额
     *
     * @param amountAfter 消费后账户金额
     */
    public void setAmountAfter(Double amountAfter) {
        this.amountAfter = amountAfter;
    }
}