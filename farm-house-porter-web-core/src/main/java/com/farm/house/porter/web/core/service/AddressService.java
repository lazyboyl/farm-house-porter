package com.farm.house.porter.web.core.service;

import com.farm.house.porter.web.core.base.AddressStaticConst;
import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.base.SystemStaticConst;
import com.farm.house.porter.web.core.dao.AddressDao;
import com.farm.house.porter.web.core.entity.Address;
import com.farm.house.porter.web.core.entity.MallUser;
import com.farm.house.porter.web.core.util.MallUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author linzf
 * @since 2019-07-25
 * 类描述： 地址的service
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class AddressService {

    /**
     * 地址的dao的对象注入
     */
    @Autowired
    private AddressDao addressDao;

    /**
     * 功能描述： 删除地址
     * @param addressId 地址流水ID
     * @return 返回删除结果
     */
    public ReturnInfo deleteAddress(String addressId){
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        if(addressDao.deleteAddress(addressId,mallUser.getUserId())>0){
            return new ReturnInfo(SystemStaticConst.SUCCESS, "删除地址成功！");
        }
        return new ReturnInfo(SystemStaticConst.FAIL, "删除地址失败！");
    }

    /**
     * 功能描述：更新地址信息
     *
     * @param addressId      地址流水ID
     * @param addressName    地址
     * @param area           街道地址
     * @param name           姓名
     * @param mobile         电话
     * @param defaultAddress 默认地址
     * @return 返回更新结果
     */
    public ReturnInfo updateAddress(String addressId, String addressName, String area, String name, String mobile, String defaultAddress) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        if (AddressStaticConst.DEFAULT_ADDRESS_CHECK.equals(defaultAddress)) {
            addressDao.updateAddressDefault(AddressStaticConst.DEFAULT_ADDRESS_UN_CHECK, mallUser.getUserId());
        }
        Address address = new Address();
        address.setAddressName(addressName);
        address.setArea(area);
        address.setDefaultAddress(defaultAddress);
        address.setMobile(mobile);
        address.setName(name);
        address.setUpdateDate(new Date());
        address.setUpdateUserId(mallUser.getUserId());
        address.setAddressId(addressId);
        if (addressDao.updateAddress(address) > 0) {
            return new ReturnInfo(SystemStaticConst.SUCCESS, "修改地址成功！");
        }
        return new ReturnInfo(SystemStaticConst.FAIL, "修改地址失败！");
    }

    /**
     * 功能描述：获取我的地址信息
     *
     * @param addressId 地址ID
     * @return 返回地址信息
     */
    public ReturnInfo getAddress(String addressId) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        Address address = addressDao.getMyAddressByAddressId(addressId, mallUser.getUserId());
        if (address == null) {
            return new ReturnInfo(SystemStaticConst.FAIL, "查无此地址信息！");
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取地址信息成功！", address);
    }

    /**
     * 功能描述：新增地址数据
     *
     * @param addressName    地址
     * @param area           街道地址
     * @param name           姓名
     * @param mobile         电话
     * @param defaultAddress 默认地址
     * @return 返回新增结果
     */
    public ReturnInfo addAddress(String addressName, String area, String name, String mobile, String defaultAddress) {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        if (AddressStaticConst.DEFAULT_ADDRESS_CHECK.equals(defaultAddress)) {
            addressDao.updateAddressDefault(AddressStaticConst.DEFAULT_ADDRESS_UN_CHECK, mallUser.getUserId());
        }
        Address address = new Address();
        address.setAddressName(addressName);
        address.setArea(area);
        address.setCrtDate(new Date());
        address.setCrtUserId(mallUser.getUserId());
        address.setDefaultAddress(defaultAddress);
        address.setMobile(mobile);
        address.setName(name);
        address.setUpdateDate(new Date());
        address.setUpdateUserId(mallUser.getUserId());
        addressDao.insert(address);
        return new ReturnInfo(SystemStaticConst.SUCCESS, "新增地址成功");
    }

    /**
     * 功能描述：根据当前登录的用户来获取用户的地址列表
     *
     * @return 返回地址列表数据
     */
    public ReturnInfo getMyAddressList() {
        MallUser mallUser = MallUserInfo.getMallUser();
        if (mallUser == null) {
            return new ReturnInfo(SystemStaticConst.NOT_LOGIN, "用户未登录，请登录以后再操作！");
        }
        return new ReturnInfo(SystemStaticConst.SUCCESS, "获取地址数据成功", addressDao.getMyAddressList(mallUser.getUserId()));
    }


}


