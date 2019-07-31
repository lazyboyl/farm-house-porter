package com.farm.house.porter.web.core.constant;

/**
 * @author linzf
 * @since 2019/7/31
 * 类描述：订单状态
 */
public class OrderConstant {

    /**
     * 支付失败
     */
    public static final String ORDER_PAY_STATE_FAIL = "9";

    /**
     * 支付成功
     */
    public static final String ORDER_PAY_STATE_SUCCESS = "5";

    /**
     * 待支付
     */
    public static final String ORDER_PAY_STATE_WAIT_PAY = "1";

    /**
     * 待付款
     */
    public static final String ORDER_STATE_WAIT_PAY = "1";

    /**
     * 待收货
     */
    public static final String ORDER_STATE_WAIT_RECEIVE = "2";

    /**
     * 待评价
     */
    public static final String ORDER_STATE_WAIT_EVALUATE = "3";

    /**
     * 售后
     */
    public static final String ORDER_STATE_AFTER_SALE = "4";

    /**
     * 订单已关闭
     */
    public static final String ORDER_STATE_CLOSE = "9";

}
