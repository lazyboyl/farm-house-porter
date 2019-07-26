<template>
	<view class="content">
		<view class="row b-b">
			<text class="tit">联系人</text>
			<input class="input" type="text" v-model="addressData.name" placeholder="收货人姓名" placeholder-class="placeholder" />
		</view>
		<view class="row b-b">
			<text class="tit">手机号</text>
			<input class="input" type="number" v-model="addressData.mobile" placeholder="收货人手机号码" placeholder-class="placeholder" />
		</view>
		<view class="row b-b">
			<text class="tit">地址</text>
			<text @click="chooseLocation" class="input">
				{{addressData.addressName}}
			</text>
			<text class="yticon icon-shouhuodizhi"></text>
		</view>
		<view class="row b-b"> 
			<text class="tit">门牌号</text>
			<input class="input" type="text" v-model="addressData.area" placeholder="楼号、门牌" placeholder-class="placeholder" />
		</view>
		
		<view class="row default-row">
			<text class="tit">设为默认</text>
			<switch :checked="addressData.defaultAddress=='1'" color="#fa436a" @change="switchChange" />
		</view>
		<button type="primary" class="add-btn" @click="confirm">提交</button>
		<button type="warn" class="add-btn" v-if="deleteBtnShow" @click="deleteAddress" >删除</button>
	</view>
</template>

<script>
	import {addAddress,updateAddress,deleteAddress} from '../../api/address/api.address.js'
	
	export default {
		data() {
			return {
				addressData: {
					name: '',
					mobile: '',
					addressName: '在地图选择',
					address: '',
					area: '',
					defaultAddress: '0'
				},
				deleteBtnShow: false
			}
		},
		onLoad(option){
			let title = '新增收货地址';
			if(option.type==='edit'){
				title = '编辑收货地址'
				this.addressData = JSON.parse(option.data)
				this.addressData.address = this.addressData.addressName;
				this.deleteBtnShow = true;
			}
			this.manageType = option.type;
			uni.setNavigationBarTitle({
				title
			})
		},
		methods: {
			switchChange(e){
				if(e.detail){
					this.addressData.defaultAddress = '1';
				}else{
					this.addressData.defaultAddress = '0';
				}
			},
			//地图选择地址
			chooseLocation(){
				uni.chooseLocation({
					success: (data)=> {
						console.log(JSON.stringify(data))
						this.addressData.addressName = data.address;
						this.addressData.address = data.address;
					}
				})
			},
			deleteAddress(){
				let addressId = this.addressData.addressId;
				let _this = this;
				uni.showModal({
                   title: '提示',
                   content: '是否删除当前的地址？',
                   success: function (res) {
                       if (res.confirm) {
                           deleteAddress({addressId:addressId}).then(res=>{
                           	if(res.code==200){
                           		_this.$api.prePage().refreshList();
                           		_this.$api.msg(res.msg);
                           		setTimeout(()=>{
                           			uni.navigateBack()
                           		}, 800)
                           	}else{
                           		_this.$api.msg(res.msg);
                           	}
                           }).catch(err => {
                           	    _this.$api.msg(err);
                           })
                       } 
                   }
                });
			},
			//提交
			confirm(){
				let data = this.addressData;
				if(!data.name){
					this.$api.msg('请填写收货人姓名');
					return;
				}
				if(!/(^1[3|4|5|7|8][0-9]{9}$)/.test(data.mobile)){
					this.$api.msg('请输入正确的手机号码');
					return;
				}
				if(!data.address){
					this.$api.msg('请在地图选择所在位置');
					return;
				}
				if(!data.area){
					this.$api.msg('请填写门牌号信息');
					return;
				}
				// 表示当前为修改数据
				if(this.manageType!='edit'){
					addAddress(data).then(res => {
						if(res.code==200){
							this.$api.prePage().refreshList();
							this.$api.msg(`地址${this.manageType=='edit' ? '修改': '添加'}成功`);
							setTimeout(()=>{
								uni.navigateBack()
							}, 800)
						}else{
							this.$api.msg(res.msg);
						}
					}).catch(err => {
						this.$api.msg(err);
					})
				}else{
					updateAddress(data).then(res => {
						if(res.code==200){
							this.$api.prePage().refreshList();
							this.$api.msg(`地址${this.manageType=='edit' ? '修改': '添加'}成功`);
							setTimeout(()=>{
								uni.navigateBack()
							}, 800)
						}else{
							this.$api.msg(res.msg);
						}
					}).catch(err => {
						this.$api.msg(err);
					})
				}
				//this.$api.prePage()获取上一页实例，可直接调用上页所有数据和方法，在App.vue定义
				
			},
		}
	}
</script>

<style lang="scss">
	page{
		background: $page-color-base;
		padding-top: 16upx;
	}

	.row{
		display: flex;
		align-items: center;
		position: relative;
		padding:0 30upx;
		height: 110upx;
		background: #fff;
		
		.tit{
			flex-shrink: 0;
			width: 120upx;
			font-size: 30upx;
			color: $font-color-dark;
		}
		.input{
			flex: 1;
			font-size: 30upx;
			color: $font-color-dark;
		}
		.icon-shouhuodizhi{
			font-size: 36upx;
			color: $font-color-light;
		}
	}
	.default-row{
		margin-top: 16upx;
		.tit{
			flex: 1;
		}
		switch{
			transform: translateX(16upx) scale(.9);
		}
	}
	.add-btn{
		display: flex;
		align-items: center;
		justify-content: center;
		width: 690upx;
		height: 80upx;
		margin: 60upx auto;
		font-size: $font-lg;
		color: #fff;
		background-color: $base-color;
		border-radius: 10upx;
		box-shadow: 1px 2px 5px rgba(219, 63, 96, 0.4);
	}
</style>
