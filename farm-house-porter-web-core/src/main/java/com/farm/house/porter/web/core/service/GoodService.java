package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.Page;
import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.constant.ImageConstant;
import com.farm.house.porter.web.core.dao.*;
import com.farm.house.porter.web.core.entity.Good;
import com.farm.house.porter.web.core.entity.Product;
import com.farm.house.porter.web.core.util.PageUtil;
import com.farm.house.porter.web.core.vo.GoodInfoVo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author linzf
 * @since 2019/7/29
 * 类描述：商品相关的service类
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class GoodService {

    /**
     * 商品的dao
     */
    @Autowired
    private GoodDao goodDao;

    /**
     * 产品的dao
     */
    @Autowired
    private ProductDao productDao;

    /**
     * 图片的dao
     */
    @Autowired
    private ImageDao imageDao;

    /**
     * 产品的图片的dao
     */
    @Autowired
    private DescInfoDao descInfoDao;

    /**
     * 产品规格
     */
    @Autowired
    private ProductSpecsDao productSpecsDao;

    /**
     * 产品规格明细的dao
     */
    @Autowired
    private ProductSpecsDetailDao productSpecsDetailDao;

    /**
     * 功能描述：根据商品ID来获取商品数据
     *
     * @param goodId 商品ID
     * @return 返回商品信息
     */
    public ReturnInfo getGoodInfo(String goodId) {
        Good good = goodDao.selectByPrimaryKey(goodId);
        if (good == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此商品数据");
        }
        Product product = productDao.selectByPrimaryKey(good.getProductId());
        if (product == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此产品数据");
        }
        GoodInfoVo goodInfoVo = new GoodInfoVo(good);
        // 获取产品规格信息
        goodInfoVo.setSpecList(productSpecsDao.getProductSpecsByProductId(product.getProductId()));
        // 获取产品规格明细数据
        goodInfoVo.setSpecChildList(productSpecsDetailDao.getProductSpecsDetailByProductId(product.getProductId()));
        // 获取产品浏览量
        goodInfoVo.setPageViews(product.getPageViews());
        // 获取产品图片详情信息
        goodInfoVo.setProductImages(descInfoDao.queryProductImageById(product.getProductId()));
        // 获取商品明细
        goodInfoVo.setGoodList(goodDao.queryGoodByProductId(product.getProductId()));
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取商品信息成功！", goodInfoVo);
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
    public ReturnInfo queryGoodList(int current, int pageSize, String type, String orderBy) {
        PageHelper.startPage(current, (pageSize > 0 && pageSize <= 500) ? pageSize : 20);
        if (orderBy != null && !"".equals(orderBy)) {
            PageHelper.orderBy(orderBy);
        }
        HashMap<String, Object> res = PageUtil.getResult(goodDao.queryGoodList(type));
        return new ReturnInfo(SystemStaticConst.SUCCESS, "查询商品的列表成功！", new Page((List) res.get("rows"), (long) res.get("total"), current, pageSize));
    }

}
