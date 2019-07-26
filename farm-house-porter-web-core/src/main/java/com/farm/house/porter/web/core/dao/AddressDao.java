package com.farm.house.porter.web.core.dao;

import com.farm.house.porter.web.core.entity.Address;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2019-07-25
 * 类描述：地址的dao
 */
public interface AddressDao extends Mapper<Address> {

    /**
     * 功能描述：删除地址
     * @param addressId 地址流水ID
     * @param userId 用户ID
     * @return 返回删除结果
     */
    int deleteAddress(@Param("addressId")String addressId,@Param("userId")String userId);

    /**
     * 功能描述：更新地址信息
     * @param address 地址信息
     * @return 返回更新结果
     */
    int updateAddress(Address address);

    /**
     * 功能描述：获取我的地址信息
     * @param addressId 地址ID
     * @param userId 用户ID
     * @return 返回地址信息
     */
    Address getMyAddressByAddressId(@Param("addressId")String addressId,@Param("userId")String userId);

    /**
     * 功能描述： 根据当前用户的ID来设置当前用户底下的其他地址数据的默认状态
     * @param defaultAddress 设置地址的默认状态
     * @param userId 用户流水ID
     * @return 返回更新结果
     */
    int updateAddressDefault(@Param("defaultAddress")String defaultAddress,@Param("userId")String userId);

    /**
     * 功能描述：根据当前登录的用户来获取用户的地址列表
     * @param userId 用户ID
     * @return 返回用户地址列表
     */
    List<Address> getMyAddressList(@Param("userId")String userId);

}