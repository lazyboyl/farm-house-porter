import {fetch} from '../base.js'

// 取消订单
export const cancelOrder = params => {
  return fetch('/order/cancelOrder',params);
};

// 删除订单
export const removeOrder = params => {
  return fetch('/order/removeOrder',params);
};

// 我的订单列表
export const myOrderList = params => {
  return fetch('/order/myOrderList',params);
};

// 直接生成订单
export const directCreation = params => {
  return fetch('/order/directCreation',params);
};

// 提交订单
export const submitOrder = params => {
  return fetch('/order/submitOrder',params);
};

// 获取生成的订单
export const getCreateOrder = params => {
  return fetch('/order/getCreateOrder',params);
};

// 生成订单
export const createOrder = params => {
  return fetch('/order/createOrder',params);
};