package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/8/2
 * 类描述：首页的controller类
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 功能描述：猜你喜欢
     * @return 返回查询结果
     */
    @PostMapping("guessYouLike")
    public ReturnInfo guessYouLike(){
        return indexService.guessYouLike();
    }

    /**
     * 功能描述：获取首页的分类列表的数据
     * @return 返回查询结果
     */
    @PostMapping("choiceType")
    public ReturnInfo choiceType(){
        return indexService.choiceType();
    }

    /**
     * 功能描述：获取首页的轮播的列表的数据
     *
     * @return 获取轮播图结果
     */
    @PostMapping("carouselList")
    public ReturnInfo carouselList(){
        return indexService.carouselList();
    }

}
