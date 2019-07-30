package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Cart;
import com.farm.house.porter.web.core.vo.CartVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：购物车的dao
 */
public interface CartDao extends Mapper<Cart> {

    /**
     * 功能描述：根据购物车ID和用户ID来删除购物车数据
     * @param cartId 购物车ID
     * @param userId 用户ID
     * @return 返回删除结果
     */
    int clearCart(@Param("cartId")String cartId,@Param("userId")String userId);

    /**
     * 功能描述：获取我的购物车列表
     * @param userId 用户流水ID
     * @return 返回查询结果
     */
    List<CartVo> getMyCartList(@Param("userId")String userId);

    /**
     * 功能描述：根据商品ID和用户ID来获取购物信息
     * @param goodId 商品ID
     * @param userId 用户ID
     * @return 返回查询结果
     */
    Cart getCartByGoodIdAndUserId(@Param("goodId")String goodId, @Param("userId")String userId);
}