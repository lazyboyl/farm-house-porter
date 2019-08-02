package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Dict;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-08-02
 * 类描述：数据字典的dao
 */
public interface DictDao extends Mapper<Dict> {

    /**
     * 功能描述：根据字典类型来获取字典数据
     * @param dictType 字典类型
     * @return 返回查询结果
     */
    List<Dict> queryDictByDictType(@Param("dictType")String dictType);

}