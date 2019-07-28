/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/28 23:14:57                           */
/*==============================================================*/


drop table if exists t_address;

drop table if exists t_cart;

drop table if exists t_consume_detail;

drop table if exists t_desc_info;

drop table if exists t_good;

drop table if exists t_good_compare_specs;

drop table if exists t_image;

drop table if exists t_mall_user;

drop table if exists t_order;

drop table if exists t_order_detail;

drop table if exists t_product;

drop table if exists t_recharge;

/*==============================================================*/
/* Table: t_address                                             */
/*==============================================================*/
create table t_address
(
   addressId            varchar(32) not null comment '地址流水ID',
   addressName          varchar(200) comment '详细地址',
   area                 varchar(200) comment '街道地址',
   name                 varchar(100) comment '联系人',
   mobile               varchar(20) comment '手机号码',
   defaultAddress       varchar(2) comment '是否为默认收货地址【1：默认；0：不默认】',
   crtDate              datetime comment '创建时间',
   crtUserId            varchar(32) comment '创建人ID',
   updateDate           datetime comment '更新时间',
   updateUserId         varchar(32) comment '更新人ID',
   primary key (addressId)
);

alter table t_address comment '用户的地址维护表';

/*==============================================================*/
/* Table: t_cart                                                */
/*==============================================================*/
create table t_cart
(
   cartId               varchar(32) not null comment '购物车流水ID',
   title                varchar(200) comment '商品标题',
   attrVal              varchar(200) comment '商品规格描述',
   price                double comment '商品价格',
   number               int comment '购买数量',
   goodId               varchar(32) comment '商品ID',
   image                varchar(200) comment '商品图片地址',
   crtUserId            varchar(32) comment '所属用户ID',
   primary key (cartId)
);

alter table t_cart comment '用户的购物车信息表';

/*==============================================================*/
/* Table: t_consume_detail                                      */
/*==============================================================*/
create table t_consume_detail
(
   consumeDetaiId       varchar(32) not null comment '消费明细流水ID',
   type                 varchar(2) comment '消费类型【1：充值；2：购物】',
   money                double comment '金额',
   consumeDate          datetime comment '消费时间',
   state                varchar(2) comment '状态【0：消费失败；1：正常；】',
   crtUserId            varchar(32) comment '消费用户流水ID',
   orderId              varchar(32) comment '关联订单ID',
   rechargeId           varchar(32) comment '充值订单ID',
   amountBefore         double comment '消费前账户金额',
   amountAfter          double comment '消费后账户金额',
   primary key (consumeDetaiId)
);

alter table t_consume_detail comment '记录用户消费的明细信息';

/*==============================================================*/
/* Table: t_desc_info                                           */
/*==============================================================*/
create table t_desc_info
(
   descImageId          varchar(32) not null comment '流水ID',
   productId            varchar(32) comment '产品流水ID',
   image                varchar(100) comment '图片地址',
   primary key (descImageId)
);

alter table t_desc_info comment '产品图文详情';

/*==============================================================*/
/* Table: t_good                                                */
/*==============================================================*/
create table t_good
(
   goodId               varchar(32) not null comment '商品流水ID',
   title                varchar(100) comment '商品名称',
   discountPrice        double comment '优惠价格',
   price                double comment '商品价格',
   couponTip            double comment '折扣',
   store                int comment '商品库存',
   sales                int comment '销量',
   pageViews            int comment '浏览量',
   defaultImage         varchar(100) comment '默认商品图片地址',
   goodNorms            varchar(500) comment '商品规格保存的数据为JSON格式的数据',
   produceId            varchar(32) comment '产品流水ID',
   state                varchar(2) comment '商品状态',
   publicTime           datetime comment '发布时间',
   primary key (goodId)
);

alter table t_good comment '用于存放商品信息';

/*==============================================================*/
/* Table: t_good_compare_specs                                  */
/*==============================================================*/
create table t_good_compare_specs
(
   goodCompareSpecsId   varchar(32) not null comment '商品与规格的对照关系流水ID',
   goodId               varchar(32) comment '商品ID',
   productId            varchar(32) comment '产品ID',
   specs                varchar(100) comment '规格信息',
   primary key (goodCompareSpecsId)
);

alter table t_good_compare_specs comment '商品与规格的对照关系表';

/*==============================================================*/
/* Table: t_image                                               */
/*==============================================================*/
create table t_image
(
   imageId              varchar(32) not null comment '图片流水ID',
   image                varchar(100) comment '图片地址',
   goodId               varchar(32) comment '商品ID',
   type                 varchar(2) comment '图片类型【1：展示的图片；2：图文详情】',
   primary key (imageId)
);

alter table t_image comment '维护所有商品的图片信息';

/*==============================================================*/
/* Table: t_mall_user                                           */
/*==============================================================*/
create table t_mall_user
(
   userId               varchar(32) not null comment '用户流水ID',
   nickName             varchar(50) comment '用户真实姓名',
   loginAccount         varchar(50) comment '登录账号',
   loginPassword        varchar(50) comment '登录密码',
   crtDate              datetime comment '创建时间',
   lastLoginDate        datetime comment '最后登录时间',
   token                varchar(50) comment '登录的token',
   headImg              varchar(100) comment '头像地址',
   money                double comment '余额',
   primary key (userId)
);

alter table t_mall_user comment '用于存储用户信息';

/*==============================================================*/
/* Table: t_order                                               */
/*==============================================================*/
create table t_order
(
   orderId              varchar(32) not null comment '订单流水ID',
   createTime           datetime comment '创建时间',
   payTime              datetime comment '付款时间',
   transportTime        datetime comment '运输时间',
   state                varchar(2) comment '订单状态【1：待付款；2：待收货；3：待评价；4：售后；9：订单已关闭】',
   orderDetailId        varchar(32) comment '订单明细ID',
   totalPrice           double comment '商品总价',
   crtUserId            varchar(32) comment '订单创建人ID',
   goodNum              int comment '商品件数',
   payType              varchar(2) comment '支付类型【1：微信；2：支付宝】',
   primary key (orderId)
);

alter table t_order comment '用户订单信息表';

/*==============================================================*/
/* Table: t_order_detail                                        */
/*==============================================================*/
create table t_order_detail
(
   orderDetailId        varchar(32) not null comment '订单明细流水ID',
   title                varchar(200) comment '商品名称',
   price                double comment '商品单价',
   image                varchar(200) comment '商品图片',
   number               int comment '购买数量',
   detailPrice          double comment '订单明细总价',
   attr                 varchar(200) comment '商品规格',
   goodId               varchar(32) comment '商品流水ID',
   primary key (orderDetailId)
);

alter table t_order_detail comment '订单明细';

/*==============================================================*/
/* Table: t_product                                             */
/*==============================================================*/
create table t_product
(
   productId            varchar(32) not null comment '产品流水ID',
   title                varchar(100) comment '产品名称',
   type                 varchar(2) comment '产品类型',
   state                varchar(2) comment '产品状态',
   specsJson            varchar(500) comment '产品规格的JSON信息例如：[{"尺寸":["xl","xxl"]},{"颜色":["白色","蓝色"]}]',
   crtDate              datetime,
   primary key (productId)
);

alter table t_product comment '主要用于存储产品信息';

/*==============================================================*/
/* Table: t_recharge                                            */
/*==============================================================*/
create table t_recharge
(
   rechargeId           varchar(32) not null comment '充值流水ID',
   money                double comment '充值金额',
   rechargeDate         datetime comment '充值时间',
   state                varchar(2) comment '充值状态【0：充值失败；1：待付款；2：充值成功；9：取消充值】',
   primary key (rechargeId)
);

alter table t_recharge comment '用户充值明细表';

