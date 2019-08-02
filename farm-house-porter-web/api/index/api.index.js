import {fetch} from '../base.js'

// 猜你喜欢
export const guessYouLike = params => {
  return fetch('/index/guessYouLike',params);
};

// 获取分类列表
export const choiceType = params => {
  return fetch('/index/choiceType',params);
};

// 获取轮播列表
export const loadCarouselList = params => {
  return fetch('/index/carouselList',params);
};