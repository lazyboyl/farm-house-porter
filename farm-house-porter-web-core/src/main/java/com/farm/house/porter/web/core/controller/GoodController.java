package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：商品相关的controller
 */
@RestController
@RequestMapping("good")
public class GoodController {

    /**
     * 商品的service
     */
    @Autowired
    private GoodService goodService;

    /**
     * 功能描述：根据商品ID来获取商品数据
     * @param goodId 商品ID
     * @return 返回商品信息
     */
    @PostMapping("getGoodInfo")
    public ReturnInfo getGoodInfo(@RequestParam("goodId")String goodId){
        return goodService.getGoodInfo(goodId);
    }

    /**
     * 功能描述： 查询商品的列表数据
     *
     * @param current  第几页
     * @param pageSize 每页显示记录条数
     * @param type     需要查询的商品类型
     * @param orderBy  排序方式
     * @return 返回查询的结果
     */
    @PostMapping("queryGoodList")
    public ReturnInfo queryGoodList(@RequestParam("current")int current, @RequestParam("pageSize")int pageSize,
                                    @RequestParam("type")String type, @RequestParam("orderBy")String orderBy){
        return goodService.queryGoodList(current, pageSize, type, orderBy);
    }

}
