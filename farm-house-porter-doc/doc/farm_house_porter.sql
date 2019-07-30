/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : farm_house_porter

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-07-30 17:24:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_address`
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address` (
  `addressId` varchar(32) NOT NULL COMMENT '地址流水ID',
  `addressName` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `area` varchar(200) DEFAULT NULL COMMENT '街道地址',
  `name` varchar(100) DEFAULT NULL COMMENT '联系人',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `defaultAddress` varchar(2) DEFAULT NULL COMMENT '鏄惁涓洪粯璁ゆ敹璐у湴鍧€銆?锛氶粯璁わ紱0锛氫笉榛樿銆?',
  `crtDate` datetime DEFAULT NULL COMMENT '创建时间',
  `crtUserId` varchar(32) DEFAULT NULL COMMENT '创建人ID',
  `updateDate` datetime DEFAULT NULL COMMENT '更新时间',
  `updateUserId` varchar(32) DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户的地址维护表';

-- ----------------------------
-- Records of t_address
-- ----------------------------
INSERT INTO `t_address` VALUES ('1', '福建省福州市鼓楼区', '马鞍小区', '林泽锋', '18559405027', '0', '2019-07-26 10:53:19', '1', '2019-07-26 15:27:30', '1');
INSERT INTO `t_address` VALUES ('53182da04c554313ab8604a9a2298edb', '福建省宁德市蕉城区闽东中路35号', '601', '林泽锋3', '18559405027', '1', '2019-07-26 15:44:45', '1', '2019-07-26 15:45:04', '1');

-- ----------------------------
-- Table structure for `t_cart`
-- ----------------------------
DROP TABLE IF EXISTS `t_cart`;
CREATE TABLE `t_cart` (
  `cartId` varchar(32) NOT NULL COMMENT '购物车流水ID',
  `title` varchar(200) DEFAULT NULL COMMENT '商品标题',
  `attrVal` varchar(200) DEFAULT NULL COMMENT '商品规格描述',
  `price` double DEFAULT NULL COMMENT '商品价格',
  `number` int(11) DEFAULT NULL COMMENT '购买数量',
  `goodId` varchar(32) DEFAULT NULL COMMENT '商品ID',
  `image` varchar(200) DEFAULT NULL COMMENT '商品图片地址',
  `crtUserId` varchar(32) DEFAULT NULL COMMENT '所属用户ID',
  PRIMARY KEY (`cartId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户的购物车信息表';

-- ----------------------------
-- Records of t_cart
-- ----------------------------

-- ----------------------------
-- Table structure for `t_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类流水ID',
  `pId` int(11) DEFAULT NULL COMMENT '分类流水父ID',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片地址',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `fullPath` varchar(200) DEFAULT NULL COMMENT '分类完全路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_category
-- ----------------------------
INSERT INTO `t_category` VALUES ('1', '0', '', '手机数码', '1');
INSERT INTO `t_category` VALUES ('2', '0', null, '礼品鲜花', '2');
INSERT INTO `t_category` VALUES ('3', '0', null, '男装女装', '3');
INSERT INTO `t_category` VALUES ('4', '0', null, '母婴用品', '4');
INSERT INTO `t_category` VALUES ('5', '1', null, '手机通讯', '1.5');
INSERT INTO `t_category` VALUES ('6', '1', null, '运营商', '1.6');
INSERT INTO `t_category` VALUES ('8', '5', '/static/temp/cate2.jpg', '全面屏手机', '1.5.8');
INSERT INTO `t_category` VALUES ('9', '5', '/static/temp/cate3.jpg', '游戏手机', '1.5.9');
INSERT INTO `t_category` VALUES ('10', '5', '/static/temp/cate1.jpg', '老人机', '1.5.10');
INSERT INTO `t_category` VALUES ('11', '5', '/static/temp/cate4.jpg', '拍照手机', '1.5.11');
INSERT INTO `t_category` VALUES ('12', '5', '/static/temp/cate5.jpg', '女性手机', '1.5.12');
INSERT INTO `t_category` VALUES ('14', '6', '/static/temp/cate1.jpg', '合约机', '1.6.14');
INSERT INTO `t_category` VALUES ('15', '6', '/static/temp/cate4.jpg', '选好卡', '1.6.15');
INSERT INTO `t_category` VALUES ('16', '6', '/static/temp/cate5.jpg', '办套餐', '1.6.16');
INSERT INTO `t_category` VALUES ('17', '2', null, '礼品', '2.17');
INSERT INTO `t_category` VALUES ('18', '2', null, '鲜花', '2.18');
INSERT INTO `t_category` VALUES ('19', '17', '/static/temp/cate7.jpg', '17', '2.17.19');
INSERT INTO `t_category` VALUES ('20', '17', '/static/temp/cate8.jpg', '创意礼品', '2.17.20');
INSERT INTO `t_category` VALUES ('21', '18', '/static/temp/cate9.jpg', '鲜花', '2.18.21');
INSERT INTO `t_category` VALUES ('22', '18', '/static/temp/cate10.jpg', '每周一花', '2.18.22');
INSERT INTO `t_category` VALUES ('23', '18', '/static/temp/cate11.jpg', '卡通花束', '2.18.23');
INSERT INTO `t_category` VALUES ('24', '18', '/static/temp/cate12.jpg', '永生花', '2.18.24');
INSERT INTO `t_category` VALUES ('25', '3', null, '男装', '3.25');
INSERT INTO `t_category` VALUES ('26', '3', null, '女装', '3.26');
INSERT INTO `t_category` VALUES ('27', '25', '/static/temp/cate13.jpg', '男士T恤', '3.25.27');
INSERT INTO `t_category` VALUES ('28', '25', '/static/temp/cate14.jpg', '男士外套', '3.25.28');
INSERT INTO `t_category` VALUES ('29', '26', '/static/temp/cate15.jpg', '裙装', '3.26.29');
INSERT INTO `t_category` VALUES ('30', '26', '/static/temp/cate16.jpg', 'T', '3.26.30');
INSERT INTO `t_category` VALUES ('31', '26', '/static/temp/cate15.jpg', '上装', '3.26.31');
INSERT INTO `t_category` VALUES ('32', '26', '/static/temp/cate16.jpg', '下装', '3.26.32');
INSERT INTO `t_category` VALUES ('33', '4', null, '奶粉', '4.33');
INSERT INTO `t_category` VALUES ('34', '4', null, '营养辅食', '4.34');
INSERT INTO `t_category` VALUES ('35', '4', null, '童装', '4.35');
INSERT INTO `t_category` VALUES ('36', '33', '/static/temp/cate17.jpg', '有机奶粉', '4.33.36');
INSERT INTO `t_category` VALUES ('37', '34', '/static/temp/cate18.jpg', '果泥/果汁', '4.34.37');
INSERT INTO `t_category` VALUES ('38', '34', '/static/temp/cate20.jpg', '面条/粥', '4.34.38');
INSERT INTO `t_category` VALUES ('39', '4', null, '喂养用品', '4.39');
INSERT INTO `t_category` VALUES ('42', '35', '/static/temp/cate19.jpg', '婴童衣橱', '4.35.42');
INSERT INTO `t_category` VALUES ('43', '39', '/static/temp/cate21.jpg', '吸奶器', '4.39.43');
INSERT INTO `t_category` VALUES ('44', '39', '/static/temp/cate22.jpg', '儿童餐具', '4.39.44');
INSERT INTO `t_category` VALUES ('45', '39', '/static/temp/cate23.jpg', '牙胶安抚', '4.39.45');
INSERT INTO `t_category` VALUES ('46', '36', '/static/temp/cate24.jpg', '围兜', '4.36.46');

-- ----------------------------
-- Table structure for `t_consume_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_consume_detail`;
CREATE TABLE `t_consume_detail` (
  `consumeDetaiId` varchar(32) NOT NULL COMMENT '消费明细流水ID',
  `type` varchar(2) DEFAULT NULL COMMENT '消费类型【1：充值；2：购物】',
  `money` double DEFAULT NULL COMMENT '金额',
  `consumeDate` datetime DEFAULT NULL COMMENT '消费时间',
  `state` varchar(2) DEFAULT NULL COMMENT '状态【0：消费失败；1：正常；】',
  `crtUserId` varchar(32) DEFAULT NULL COMMENT '消费用户流水ID',
  `orderId` varchar(32) DEFAULT NULL COMMENT '关联订单ID',
  `rechargeId` varchar(32) DEFAULT NULL COMMENT '充值订单ID',
  `amountBefore` double DEFAULT NULL COMMENT '消费前账户金额',
  `amountAfter` double DEFAULT NULL COMMENT '消费后账户金额',
  PRIMARY KEY (`consumeDetaiId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='记录用户消费的明细信息';

-- ----------------------------
-- Records of t_consume_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_desc_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_desc_info`;
CREATE TABLE `t_desc_info` (
  `descImageId` varchar(32) NOT NULL COMMENT '流水ID',
  `productId` varchar(32) DEFAULT NULL COMMENT '产品流水ID',
  `image` varchar(100) DEFAULT NULL COMMENT '图片地址',
  PRIMARY KEY (`descImageId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='产品图文详情';

-- ----------------------------
-- Records of t_desc_info
-- ----------------------------
INSERT INTO `t_desc_info` VALUES ('1', '1', '/products/1/1.jpg');
INSERT INTO `t_desc_info` VALUES ('2', '1', '/products/1/2.jpg');
INSERT INTO `t_desc_info` VALUES ('3', '1', '/products/1/3.jpg');
INSERT INTO `t_desc_info` VALUES ('4', '1', '/products/1/4.jpg');
INSERT INTO `t_desc_info` VALUES ('5', '1', '/products/1/5.jpg');

-- ----------------------------
-- Table structure for `t_good`
-- ----------------------------
DROP TABLE IF EXISTS `t_good`;
CREATE TABLE `t_good` (
  `goodId` varchar(32) NOT NULL COMMENT '商品流水ID',
  `title` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `discountPrice` double DEFAULT NULL COMMENT '优惠价格',
  `price` double DEFAULT NULL COMMENT '商品价格',
  `couponTip` double DEFAULT NULL COMMENT '折扣',
  `store` int(11) DEFAULT NULL COMMENT '商品库存',
  `sales` int(11) DEFAULT NULL COMMENT '销量',
  `defaultImage` varchar(100) DEFAULT NULL COMMENT '默认商品图片地址',
  `goodNorms` varchar(500) DEFAULT NULL COMMENT '商品规格保存的数据为JSON格式的数据',
  `productId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '浜у搧娴佹按ID',
  `state` varchar(2) DEFAULT NULL COMMENT '商品状态',
  `publicTime` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`goodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用于存放商品信息';

-- ----------------------------
-- Records of t_good
-- ----------------------------
INSERT INTO `t_good` VALUES ('1', '古黛妃 短袖t恤女夏装xl白色', '179', '179', '100', '100', '60', '/goods/1/1.jpg', '1,3', '1', '1', '2019-07-29 14:17:29');
INSERT INTO `t_good` VALUES ('2', '古黛妃 短袖t恤女夏装xxl白色', '185', '185', '100', '50', '80', '/goods/2/1.jpg', '2,3', '1', '1', '2019-07-29 14:19:52');
INSERT INTO `t_good` VALUES ('3', '古黛妃 短袖t恤女夏装xl蓝色', '195', '195', '100', '40', '90', '/goods/3/1.jpg', '1,4', '1', '1', '2019-07-29 14:21:16');
INSERT INTO `t_good` VALUES ('4', '古黛妃 短袖t恤女夏装xxl蓝色', '260', '520', '50', '10', '900', '/goods/4/1.jpg', '2,4', '1', '1', '2019-07-29 14:27:52');
INSERT INTO `t_good` VALUES ('5', '上装连衣裙xl黑色', '400', '800', '50', '70', '70', '/goods/5/1.jpg', '5,7', '2', '1', '2019-07-29 19:59:35');
INSERT INTO `t_good` VALUES ('6', '上装连衣裙xxl绿色', '900', '900', '100', '41', '30', '/goods/6/1.jpg', '6,8', '2', '1', '2019-07-29 20:00:22');
INSERT INTO `t_good` VALUES ('7', '上装连衣裙xxl黑色', '700', '700', '100', '44', '32', '/goods/7/1.jpg', '6,7', '2', '1', '2019-07-29 20:01:15');
INSERT INTO `t_good` VALUES ('8', '上装连衣裙xl绿色', '701', '701', '100', '52', '87', '/goods/8/1.jpg', '5,8', '2', '1', '2019-07-29 20:01:51');

-- ----------------------------
-- Table structure for `t_good_compare_specs`
-- ----------------------------
DROP TABLE IF EXISTS `t_good_compare_specs`;
CREATE TABLE `t_good_compare_specs` (
  `goodCompareSpecsId` varchar(32) NOT NULL COMMENT '商品与规格的对照关系流水ID',
  `goodId` varchar(32) DEFAULT NULL COMMENT '商品ID',
  `productId` varchar(32) DEFAULT NULL COMMENT '产品ID',
  `specs` varchar(100) DEFAULT NULL COMMENT '规格信息',
  PRIMARY KEY (`goodCompareSpecsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品与规格的对照关系表';

-- ----------------------------
-- Records of t_good_compare_specs
-- ----------------------------
INSERT INTO `t_good_compare_specs` VALUES ('1', '1', '1', 'xl,白色');

-- ----------------------------
-- Table structure for `t_image`
-- ----------------------------
DROP TABLE IF EXISTS `t_image`;
CREATE TABLE `t_image` (
  `imageId` varchar(32) NOT NULL COMMENT '图片流水ID',
  `image` varchar(100) DEFAULT NULL COMMENT '图片地址',
  `goodId` varchar(32) DEFAULT NULL COMMENT '商品ID',
  `type` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`imageId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='维护所有商品的图片信息';

-- ----------------------------
-- Records of t_image
-- ----------------------------
INSERT INTO `t_image` VALUES ('1', '/goods/1/1.jpg', '1', '1');
INSERT INTO `t_image` VALUES ('10', '/goods/4/1.jpg', '4', '1');
INSERT INTO `t_image` VALUES ('11', '/goods/4/2.jpg', '4', '1');
INSERT INTO `t_image` VALUES ('12', '/goods/4/3.jpg', '4', '1');
INSERT INTO `t_image` VALUES ('14', '/goods/5/1.jpg', '5', '1');
INSERT INTO `t_image` VALUES ('15', '/goods/5/2.jpg', '5', '1');
INSERT INTO `t_image` VALUES ('16', '/goods/5/3.jpg', '5', '1');
INSERT INTO `t_image` VALUES ('17', '/goods/6/1.jpg', '6', '1');
INSERT INTO `t_image` VALUES ('18', '/goods/6/2.jpg', '6', '1');
INSERT INTO `t_image` VALUES ('19', '/goods/6/3.jpg', '6', '1');
INSERT INTO `t_image` VALUES ('2', '/goods/1/2.jpg', '1', '1');
INSERT INTO `t_image` VALUES ('20', '/goods/7/1.jpg', '7', '1');
INSERT INTO `t_image` VALUES ('21', '/goods/7/2.jpg', '7', '1');
INSERT INTO `t_image` VALUES ('22', '/goods/7/3.jpg', '7', '1');
INSERT INTO `t_image` VALUES ('23', '/goods/8/1.jpg', '8', '1');
INSERT INTO `t_image` VALUES ('24', '/goods/8/2.jpg', '8', '1');
INSERT INTO `t_image` VALUES ('25', '/goods/8/3.jpg', '8', '1');
INSERT INTO `t_image` VALUES ('3', '/goods/1/3.jpg', '1', '1');
INSERT INTO `t_image` VALUES ('4', '/goods/2/1.jpg', '2', '1');
INSERT INTO `t_image` VALUES ('5', '/goods/2/2.jpg', '2', '1');
INSERT INTO `t_image` VALUES ('6', '/goods/2/3.jpg', '2', '1');
INSERT INTO `t_image` VALUES ('7', '/goods/3/1.jpg', '3', '1');
INSERT INTO `t_image` VALUES ('8', '/goods/3/2.jpg', '3', '1');
INSERT INTO `t_image` VALUES ('9', '/goods/3/3.jpg', '3', '1');

-- ----------------------------
-- Table structure for `t_mall_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_mall_user`;
CREATE TABLE `t_mall_user` (
  `userId` varchar(32) NOT NULL COMMENT '用户流水ID',
  `nickName` varchar(50) DEFAULT NULL COMMENT '用户真实姓名',
  `loginAccount` varchar(50) DEFAULT NULL COMMENT '登录账号',
  `loginPassword` varchar(50) DEFAULT NULL COMMENT '登录密码',
  `crtDate` datetime DEFAULT NULL COMMENT '创建时间',
  `lastLoginDate` datetime DEFAULT NULL COMMENT '最后登录时间',
  `token` varchar(50) DEFAULT NULL COMMENT '登录的token',
  `headImg` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `money` double DEFAULT NULL COMMENT '余额',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用于存储用户信息';

-- ----------------------------
-- Records of t_mall_user
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `orderId` varchar(32) NOT NULL COMMENT '订单流水ID',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `payTime` datetime DEFAULT NULL COMMENT '付款时间',
  `transportTime` datetime DEFAULT NULL COMMENT '运输时间',
  `state` varchar(2) DEFAULT NULL COMMENT '订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】',
  `orderDetailId` varchar(32) DEFAULT NULL COMMENT '订单明细ID',
  `totalPrice` double DEFAULT NULL COMMENT '商品总价',
  `crtUserId` varchar(32) DEFAULT NULL COMMENT '订单创建人ID',
  `goodNum` int(11) DEFAULT NULL COMMENT '商品件数',
  `payType` varchar(2) DEFAULT NULL COMMENT '支付类型【1：微信；2：支付宝】',
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户订单信息表';

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_detail`;
CREATE TABLE `t_order_detail` (
  `orderDetailId` varchar(32) NOT NULL COMMENT '订单明细流水ID',
  `title` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `price` double DEFAULT NULL COMMENT '商品单价',
  `image` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `number` int(11) DEFAULT NULL COMMENT '购买数量',
  `detailPrice` double DEFAULT NULL COMMENT '订单明细总价',
  `attr` varchar(200) DEFAULT NULL COMMENT '商品规格',
  `goodId` varchar(32) DEFAULT NULL COMMENT '商品流水ID',
  PRIMARY KEY (`orderDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单明细';

-- ----------------------------
-- Records of t_order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `productId` varchar(32) NOT NULL COMMENT '产品流水ID',
  `title` varchar(100) DEFAULT NULL COMMENT '产品名称',
  `type` varchar(20) DEFAULT NULL COMMENT '浜у搧绫诲瀷',
  `state` varchar(2) DEFAULT NULL COMMENT '产品状态',
  `specsJson` varchar(500) DEFAULT NULL COMMENT '产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]',
  `crtDate` datetime DEFAULT NULL,
  `totalSales` int(11) DEFAULT NULL,
  `pageViews` int(11) DEFAULT NULL,
  `goodId` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='主要用于存储产品信息';

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', '下装连衣裙', '3.26.32', '1', '[{\"尺寸\":[\"xl\",\"xxl\"]},{\"颜色\":[\"白色\",\"蓝色\"]}]', '2019-07-29 14:03:58', '500', '656', '1');
INSERT INTO `t_product` VALUES ('2', '上装连衣裙', '3.26.32', '1', '[{\"尺寸\":[\"xl\",\"xxl\"]},{\"颜色\":[\"黑色\",\"绿色\"]}]', '2019-07-29 19:58:18', '800', '700', '8');

-- ----------------------------
-- Table structure for `t_product_specs`
-- ----------------------------
DROP TABLE IF EXISTS `t_product_specs`;
CREATE TABLE `t_product_specs` (
  `productSpecsId` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '产品规格表流水ID',
  `productId` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '产品ID',
  `specs` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '规格信息',
  PRIMARY KEY (`productSpecsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='产品规格表';

-- ----------------------------
-- Records of t_product_specs
-- ----------------------------
INSERT INTO `t_product_specs` VALUES ('1', '1', '尺寸');
INSERT INTO `t_product_specs` VALUES ('2', '1', '颜色');
INSERT INTO `t_product_specs` VALUES ('3', '2', '尺寸');
INSERT INTO `t_product_specs` VALUES ('4', '2', '颜色');

-- ----------------------------
-- Table structure for `t_product_specs_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_product_specs_detail`;
CREATE TABLE `t_product_specs_detail` (
  `productSpecsDetailId` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '产品规格明细表流水ID',
  `productId` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '产品ID',
  `productSpecsId` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '产品规格表流水ID',
  `productSpecsDetailName` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '产品规格明细名称',
  PRIMARY KEY (`productSpecsDetailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='产品规格明细表';

-- ----------------------------
-- Records of t_product_specs_detail
-- ----------------------------
INSERT INTO `t_product_specs_detail` VALUES ('1', '1', '1', 'XL');
INSERT INTO `t_product_specs_detail` VALUES ('2', '1', '1', 'XXL');
INSERT INTO `t_product_specs_detail` VALUES ('3', '1', '2', '白色');
INSERT INTO `t_product_specs_detail` VALUES ('4', '1', '2', '蓝色');
INSERT INTO `t_product_specs_detail` VALUES ('5', '2', '3', 'XL');
INSERT INTO `t_product_specs_detail` VALUES ('6', '2', '3', 'XXL');
INSERT INTO `t_product_specs_detail` VALUES ('7', '2', '4', '黑色');
INSERT INTO `t_product_specs_detail` VALUES ('8', '2', '4', '绿色');

-- ----------------------------
-- Table structure for `t_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `t_recharge`;
CREATE TABLE `t_recharge` (
  `rechargeId` varchar(32) NOT NULL COMMENT '充值流水ID',
  `money` double DEFAULT NULL COMMENT '充值金额',
  `rechargeDate` datetime DEFAULT NULL COMMENT '充值时间',
  `state` varchar(2) DEFAULT NULL COMMENT '充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】',
  PRIMARY KEY (`rechargeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户充值明细表';

-- ----------------------------
-- Records of t_recharge
-- ----------------------------
