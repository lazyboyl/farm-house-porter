import {fetch} from '../base.js'

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