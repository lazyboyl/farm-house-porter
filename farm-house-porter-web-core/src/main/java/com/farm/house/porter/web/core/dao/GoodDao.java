package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.vo.GoodListVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：商品的dao
 */
public interface GoodDao extends Mapper<Good> {

    /**
     * 功能描述： 根据产品ID来查询产品底下的所有商品
     * @param productId 产品ID
     * @return 返回查询结果
     */
    List<Good> queryGoodByProductId(@Param("productId")String productId);

    /**
     * 功能描述： 查询商品的列表数据
     * @param type 查询的商品的类型
     * @return 返回查询结果
     */
    List<GoodListVo> queryGoodList(@Param("type")String type);

}