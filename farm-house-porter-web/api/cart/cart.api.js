import {fetch} from '../base.js'

// 获取我的购物车列表
export const getMyCartList = params => {
  return fetch('/cart/getMyCartList',params);
};

// 删除购物车数据
export const clearCart = params => {
  return fetch('/cart/clearCart',params);
};

// 添加到购物车
export const addToCart = params => {
  return fetch('/cart/addToCart',params);
};

