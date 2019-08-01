package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Order;
import com.farm.house.porter.web.core.vo.OrderListVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-31
 * 类描述：订单的dao
 */
public interface OrderDao extends Mapper<Order> {

    /**
     * 功能描述：更新订单状态
     * @param userId 用户ID
     * @param orderId 订单ID
     * @param state 订单状态
     * @return 返回更新结果
     */
    int updateMyOrderStateByOrderId(@Param("userId")String userId,@Param("orderId")String orderId,@Param("state")String state);

    /**
     * 功能描述：删除我的订单数据
     * @param userId 用户ID
     * @param orderId 订单ID
     * @return 返回删除结果
     */
    int deleteMyOrderByOrderId(@Param("userId")String userId,@Param("orderId")String orderId);

    /**
     * 功能描述： 获取我的订单数据
     * @param userId 用户ID
     * @param orderId 订单ID
     * @return 返回获取结果
     */
    Order getMyOrderByOrderId(@Param("userId")String userId,@Param("orderId")String orderId);

    /**
     * 功能描述：查询我的订单列表
     * @param userId 用户ID
     * @param state 订单状态
     * @return 返回查询结果
     */
    List<OrderListVo> myOrderList(@Param("userId")String userId,@Param("state")String state);

    /**
     * 功能描述：统计我的订单列表
     * @param userId 用户ID
     * @param state 订单状态
     * @return 返回查询结果
     */
    Long myOrderList_COUNT(@Param("userId")String userId,@Param("state")String state);

}