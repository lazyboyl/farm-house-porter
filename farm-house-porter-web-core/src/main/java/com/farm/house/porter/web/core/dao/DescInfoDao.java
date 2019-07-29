package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.DescInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-29
 * 类描述：产品图文详情的dap
 */
public interface DescInfoDao extends Mapper<DescInfo> {

    /**
     * 功能描述：根据产品ID来获取产品的图文详情
     * @param productId 产品ID
     * @return 返回查询结果
     */
    List<DescInfo> queryProductImageById(@Param("productId")String productId);

}