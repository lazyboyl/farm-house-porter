import {fetch} from '../base.js'

// 查询商品的列表数据
export const queryGoodList = params => {
  return fetch('/good/queryGoodList',params);
};

// 根据商品ID来获取商品数据
export const getGoodInfo = params => {
  return fetch('/good/getGoodInfo',params);
};