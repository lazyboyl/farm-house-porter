package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.ProductSpecsDetail;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-30
 * 类描述：产品规格明细的dao
 */
public interface ProductSpecsDetailDao extends Mapper<ProductSpecsDetail> {

    /**
     * 功能描述：根据产品ID来获取产品规格明细数据
     * @param productId 产品ID
     * @return 返回产品规格明细数据
     */
    List<ProductSpecsDetail> getProductSpecsDetailByProductId(@Param("productId")String productId);

}