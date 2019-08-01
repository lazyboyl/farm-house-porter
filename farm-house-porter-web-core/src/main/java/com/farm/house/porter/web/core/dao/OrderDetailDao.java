package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author linzf
 * @since 2019-08-01
 * 类描述：订单明细的dao
 */
public interface OrderDetailDao extends Mapper<OrderDetail> {

    /**
     * 功能描述：删除我的订单的明细数据
     * @param orderId 订单ID
     * @return 返回删除结果
     */
    Integer deleteMyOrderDetailByOrderId(@Param("orderId")String orderId);

}