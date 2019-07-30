package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.ProductSpecs;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：产品规格的dao
 */
public interface ProductSpecsDao extends Mapper<ProductSpecs> {

    /**
     * 功能描述：根据产品ID来获取产品规格
     * @param productId 产品ID
     * @return 返回查询结果
     */
    List<ProductSpecs> getProductSpecsByProductId(@Param("productId")String productId);

}