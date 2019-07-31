import {fetch} from '../base.js'

// 获取默认地址
export const getDefaultAddress = params => {
  return fetch('/address/getDefaultAddress',params);
};

// 删除地址
export const deleteAddress = params => {
  return fetch('/address/deleteAddress',params);
};

// 更新地址信息
export const updateAddress = params => {
    return fetch('/address/updateAddress',params);
};

// 根据地址ID来获取地址数据
export const getAddress = params => {
    return fetch('/address/getAddress',params);
};

//新增地址数据
export const addAddress = params => {
    return fetch('/address/addAddress',params);
};

// 根据当前登录的用户来获取用户的地址列表
export const getMyAddressList = params => {
    return fetch('/address/getMyAddressList',params);
};