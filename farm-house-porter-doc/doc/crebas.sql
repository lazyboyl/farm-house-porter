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
   addressId            varchar(32) not null comment '��ַ��ˮID',
   addressName          varchar(200) comment '��ϸ��ַ',
   area                 varchar(200) comment '�ֵ���ַ',
   name                 varchar(100) comment '��ϵ��',
   mobile               varchar(20) comment '�ֻ�����',
   defaultAddress       varchar(2) comment '�Ƿ�ΪĬ���ջ���ַ��1��Ĭ�ϣ�0����Ĭ�ϡ�',
   crtDate              datetime comment '����ʱ��',
   crtUserId            varchar(32) comment '������ID',
   updateDate           datetime comment '����ʱ��',
   updateUserId         varchar(32) comment '������ID',
   primary key (addressId)
);

alter table t_address comment '�û��ĵ�ַά����';

/*==============================================================*/
/* Table: t_cart                                                */
/*==============================================================*/
create table t_cart
(
   cartId               varchar(32) not null comment '���ﳵ��ˮID',
   title                varchar(200) comment '��Ʒ����',
   attrVal              varchar(200) comment '��Ʒ�������',
   price                double comment '��Ʒ�۸�',
   number               int comment '��������',
   goodId               varchar(32) comment '��ƷID',
   image                varchar(200) comment '��ƷͼƬ��ַ',
   crtUserId            varchar(32) comment '�����û�ID',
   primary key (cartId)
);

alter table t_cart comment '�û��Ĺ��ﳵ��Ϣ��';

/*==============================================================*/
/* Table: t_consume_detail                                      */
/*==============================================================*/
create table t_consume_detail
(
   consumeDetaiId       varchar(32) not null comment '������ϸ��ˮID',
   type                 varchar(2) comment '�������͡�1����ֵ��2�����',
   money                double comment '���',
   consumeDate          datetime comment '����ʱ��',
   state                varchar(2) comment '״̬��0������ʧ�ܣ�1����������',
   crtUserId            varchar(32) comment '�����û���ˮID',
   orderId              varchar(32) comment '��������ID',
   rechargeId           varchar(32) comment '��ֵ����ID',
   amountBefore         double comment '����ǰ�˻����',
   amountAfter          double comment '���Ѻ��˻����',
   primary key (consumeDetaiId)
);

alter table t_consume_detail comment '��¼�û����ѵ���ϸ��Ϣ';

/*==============================================================*/
/* Table: t_desc_info                                           */
/*==============================================================*/
create table t_desc_info
(
   descImageId          varchar(32) not null comment '��ˮID',
   productId            varchar(32) comment '��Ʒ��ˮID',
   image                varchar(100) comment 'ͼƬ��ַ',
   primary key (descImageId)
);

alter table t_desc_info comment '��Ʒͼ������';

/*==============================================================*/
/* Table: t_good                                                */
/*==============================================================*/
create table t_good
(
   goodId               varchar(32) not null comment '��Ʒ��ˮID',
   title                varchar(100) comment '��Ʒ����',
   discountPrice        double comment '�Żݼ۸�',
   price                double comment '��Ʒ�۸�',
   couponTip            double comment '�ۿ�',
   store                int comment '��Ʒ���',
   sales                int comment '����',
   pageViews            int comment '�����',
   defaultImage         varchar(100) comment 'Ĭ����ƷͼƬ��ַ',
   goodNorms            varchar(500) comment '��Ʒ��񱣴������ΪJSON��ʽ������',
   produceId            varchar(32) comment '��Ʒ��ˮID',
   state                varchar(2) comment '��Ʒ״̬',
   publicTime           datetime comment '����ʱ��',
   primary key (goodId)
);

alter table t_good comment '���ڴ����Ʒ��Ϣ';

/*==============================================================*/
/* Table: t_good_compare_specs                                  */
/*==============================================================*/
create table t_good_compare_specs
(
   goodCompareSpecsId   varchar(32) not null comment '��Ʒ����Ķ��չ�ϵ��ˮID',
   goodId               varchar(32) comment '��ƷID',
   productId            varchar(32) comment '��ƷID',
   specs                varchar(100) comment '�����Ϣ',
   primary key (goodCompareSpecsId)
);

alter table t_good_compare_specs comment '��Ʒ����Ķ��չ�ϵ��';

/*==============================================================*/
/* Table: t_image                                               */
/*==============================================================*/
create table t_image
(
   imageId              varchar(32) not null comment 'ͼƬ��ˮID',
   image                varchar(100) comment 'ͼƬ��ַ',
   goodId               varchar(32) comment '��ƷID',
   type                 varchar(2) comment 'ͼƬ���͡�1��չʾ��ͼƬ��2��ͼ�����顿',
   primary key (imageId)
);

alter table t_image comment 'ά��������Ʒ��ͼƬ��Ϣ';

/*==============================================================*/
/* Table: t_mall_user                                           */
/*==============================================================*/
create table t_mall_user
(
   userId               varchar(32) not null comment '�û���ˮID',
   nickName             varchar(50) comment '�û���ʵ����',
   loginAccount         varchar(50) comment '��¼�˺�',
   loginPassword        varchar(50) comment '��¼����',
   crtDate              datetime comment '����ʱ��',
   lastLoginDate        datetime comment '����¼ʱ��',
   token                varchar(50) comment '��¼��token',
   headImg              varchar(100) comment 'ͷ���ַ',
   money                double comment '���',
   primary key (userId)
);

alter table t_mall_user comment '���ڴ洢�û���Ϣ';

/*==============================================================*/
/* Table: t_order                                               */
/*==============================================================*/
create table t_order
(
   orderId              varchar(32) not null comment '������ˮID',
   createTime           datetime comment '����ʱ��',
   payTime              datetime comment '����ʱ��',
   transportTime        datetime comment '����ʱ��',
   state                varchar(2) comment '����״̬��1�������2�����ջ���3�������ۣ�4���ۺ�9�������ѹرա�',
   orderDetailId        varchar(32) comment '������ϸID',
   totalPrice           double comment '��Ʒ�ܼ�',
   crtUserId            varchar(32) comment '����������ID',
   goodNum              int comment '��Ʒ����',
   payType              varchar(2) comment '֧�����͡�1��΢�ţ�2��֧������',
   primary key (orderId)
);

alter table t_order comment '�û�������Ϣ��';

/*==============================================================*/
/* Table: t_order_detail                                        */
/*==============================================================*/
create table t_order_detail
(
   orderDetailId        varchar(32) not null comment '������ϸ��ˮID',
   title                varchar(200) comment '��Ʒ����',
   price                double comment '��Ʒ����',
   image                varchar(200) comment '��ƷͼƬ',
   number               int comment '��������',
   detailPrice          double comment '������ϸ�ܼ�',
   attr                 varchar(200) comment '��Ʒ���',
   goodId               varchar(32) comment '��Ʒ��ˮID',
   primary key (orderDetailId)
);

alter table t_order_detail comment '������ϸ';

/*==============================================================*/
/* Table: t_product                                             */
/*==============================================================*/
create table t_product
(
   productId            varchar(32) not null comment '��Ʒ��ˮID',
   title                varchar(100) comment '��Ʒ����',
   type                 varchar(2) comment '��Ʒ����',
   state                varchar(2) comment '��Ʒ״̬',
   specsJson            varchar(500) comment '��Ʒ����JSON��Ϣ���磺[{"�ߴ�":["xl","xxl"]},{"��ɫ":["��ɫ","��ɫ"]}]',
   crtDate              datetime,
   primary key (productId)
);

alter table t_product comment '��Ҫ���ڴ洢��Ʒ��Ϣ';

/*==============================================================*/
/* Table: t_recharge                                            */
/*==============================================================*/
create table t_recharge
(
   rechargeId           varchar(32) not null comment '��ֵ��ˮID',
   money                double comment '��ֵ���',
   rechargeDate         datetime comment '��ֵʱ��',
   state                varchar(2) comment '��ֵ״̬��0����ֵʧ�ܣ�1�������2����ֵ�ɹ���9��ȡ����ֵ��',
   primary key (rechargeId)
);

alter table t_recharge comment '�û���ֵ��ϸ��';

