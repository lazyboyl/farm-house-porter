package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：商品分类的实现
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class CategoryService {

    /**
     * 商品分类的dao
     */
    @Autowired
    private CategoryDao categoryDao;

    /**
     * 功能描述：获取分类数据列表成功
     * @return 返回查询结果
     */
    public ReturnInfo loadCategory(){
        return new ReturnInfo(SystemStaticConst.SUCCESS,"获取分类数据列表成功",categoryDao.selectAll());
    }

}
