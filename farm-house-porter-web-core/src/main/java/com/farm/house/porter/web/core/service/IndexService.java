package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.constant.IndexConstant;
import com.farm.house.porter.web.core.dao.DictDao;
import com.farm.house.porter.web.core.dao.GoodDao;
import com.farm.house.porter.web.core.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linzf
 * @since 2019/8/2
 * 类描述：首页查询业务类的实现
 */
@Service
public class IndexService {

    /**
     * 数据字典的dao
     */
    @Autowired
    private DictDao dictDao;

    /**
     * 商品的DAO
     */
    @Autowired
    private GoodDao goodDao;

    /**
     * 功能描述：猜你喜欢
     * @return 返回查询结果
     */
    public ReturnInfo guessYouLike(){
        List<Dict> goodList = dictDao.queryDictByDictType(IndexConstant.GUEST_YOU_LIKE);
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取分类列表数据成功！",goodDao.queryGoodByGoodIds(goodList));
    }

    /**
     * 功能描述：获取首页的分类列表的数据
     * @return 返回查询结果
     */
    public ReturnInfo choiceType(){
        List<Dict> dictList = dictDao.queryDictByDictType(IndexConstant.CHOICE_TYPE);
        List<Map<String,Object>> obj = new ArrayList<>(dictList.size());
        List<Dict> goodList;
        Map<String,Object> o;
        for(Dict dict:dictList){
            // 查询分类底下的商品数据的ID的集合
            goodList =  dictDao.queryDictByDictType(dict.getDictValue());
            o = new HashMap<>(2);
            o.put("floorImg",dict.getDictText());
            o.put("floorList",goodDao.queryGoodByGoodIds(goodList));
            obj.add(o);
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取分类列表数据成功！",obj);
    }

    /**
     * 功能描述：获取首页的轮播的列表的数据
     *
     * @return 获取轮播图结果
     */
    public ReturnInfo carouselList() {
        List<Dict> dictList = dictDao.queryDictByDictType(IndexConstant.CAROUSE);
        List<Map<String, Object>> obj = new ArrayList<>(dictList.size());
        Map<String, Object> m;
        for (Dict dict : dictList) {
            m = new HashMap<>();
            m.put("goodId",dict.getDictValue());
            m.put("defaultImage",dict.getDictText());
            m.put("background",dict.getDictCode());
            obj.add(m);
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取轮播数据成功！",obj);
    }

}
