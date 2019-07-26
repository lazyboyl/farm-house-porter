package com.farm.house.porter.web.core.controller;

import com.farm.house.porter.web.core.base.ReturnInfo;
import com.farm.house.porter.web.core.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzf
 * @since 2019/7/24
 * 类描述：地址的controller类
 */
@RestController
@RequestMapping("address")
public class AddressController {

    /**
     * 地址的service对象
     */
    @Autowired
    private AddressService addressService;

    /**
     * 功能描述： 删除地址
     * @param addressId 地址流水ID
     * @return 返回删除结果
     */
    @PostMapping("deleteAddress")
    public ReturnInfo deleteAddress(@RequestParam("addressId")String addressId){
        return addressService.deleteAddress(addressId);
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
    @PostMapping("updateAddress")
    public ReturnInfo updateAddress(@RequestParam("addressId")String addressId, @RequestParam("addressName")String addressName,
                                    @RequestParam("area")String area, @RequestParam("name")String name,
                                    @RequestParam("mobile")String mobile, @RequestParam("defaultAddress")String defaultAddress){
        return addressService.updateAddress(addressId, addressName, area, name, mobile, defaultAddress);
    }

    /**
     * 功能描述：根据地址ID来获取地址数据
     * @param addressId 地址ID
     * @return 返回地址信息
     */
    @PostMapping("getAddress")
    public ReturnInfo getAddress(@RequestParam("addressId")String addressId){
        return addressService.getAddress(addressId);
    }

    /**
     * 功能描述：新增地址数据
     * @param addressName 地址
     * @param area 街道地址
     * @param name 姓名
     * @param mobile 电话
     * @param defaultAddress 默认地址
     * @return 返回新增结果
     */
    @PostMapping("addAddress")
    public ReturnInfo addAddress(@RequestParam("addressName")String addressName,@RequestParam("area")String area,
                                 @RequestParam("name")String name,@RequestParam("mobile")String mobile,
                                 @RequestParam("defaultAddress")String defaultAddress){
        return addressService.addAddress(addressName, area, name, mobile, defaultAddress);
    }

    /**
     * 功能描述：根据当前登录的用户来获取用户的地址列表
     *
     * @return 返回地址列表数据
     */
    @PostMapping("getMyAddressList")
    public ReturnInfo getMyAddressList() {
        return addressService.getMyAddressList();
    }

}
