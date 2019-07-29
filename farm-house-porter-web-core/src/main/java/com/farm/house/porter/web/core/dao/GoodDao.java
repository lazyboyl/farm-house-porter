package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.vo.GoodListVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GoodDao extends Mapper<Good> {

    /**
     * 功能描述： 查询商品的列表数据
     * @param type 查询的商品的类型
     * @return 返回查询结果
     */
    List<GoodListVo> queryGoodList(@Param("type")String type);

}