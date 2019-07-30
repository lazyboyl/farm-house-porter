import {fetch} from '../base.js'

// 获取分类数据列表
export const loadCategory = params => {
  return fetch('/category/loadCategory',params);
};