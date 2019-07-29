package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：分类的controller
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 功能描述：获取分类数据列表成功
     * @return 返回查询结果
     */
    @PostMapping("loadCategory")
    public ReturnInfo loadCategory(){
        return categoryService.loadCategory();
    }

}
