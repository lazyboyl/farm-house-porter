package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Image;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-29
 * 类描述：图片的到
 */
public interface ImageDao extends Mapper<Image> {

    /**
     * 功能描述：根据id和图片类型来获取图片数据集合
     * @param goodId id
     * @param type 类型
     * @return 返回查询结果
     */
    List<Image> queryImageById(@Param("goodId")String goodId, @Param("type")String type);

}