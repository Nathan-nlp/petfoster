<template>
	<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"0px auto","position":"relative","background":"none"}'>
			<el-form
			:style='{"border":"0px solid #28890b30","width":"100%","padding":"30px","position":"relative","background":"none"}'
				class="add-update-preview"
				ref="ruleForm"
				:model="ruleForm"
				:rules="rules"
				label-width="180px"
			>

			<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="商家账号" prop="shangjiazhanghao">
							<el-input v-model="ruleForm.shangjiazhanghao" 
									placeholder="商家账号" clearable :disabled="true"></el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="商家姓名" prop="shangjiaxingming">
							<el-input v-model="ruleForm.shangjiaxingming" 
									placeholder="商家姓名" clearable :disabled="true"></el-input>
						</el-form-item>

						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物名称" prop="chongwumingcheng">
							<el-input v-model="ruleForm.chongwumingcheng" 
									placeholder="宠物名称" clearable :disabled="true"></el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="宠物类型" prop="chongwuleixing">
							<el-select v-model="ruleForm.chongwuleixing" placeholder="请选择宠物类型" :disabled="true" >
								<el-option
										v-for="(item,index) in chongwuleixingOptions"
										:key="index"
										:label="item"
										:value="item">
								</el-option>
							</el-select>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="宠物照片" v-if="type!='cross' || (type=='cross' && !ro.fengmian)" prop="fengmian">
							<file-upload
							tip="点击上传宠物照片"
							action="file/upload"
							:limit="3"
							:multiple="true"
							:fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
							@change="fengmianUploadChange"
							:disabled="true"
							></file-upload>
						</el-form-item>
							<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="宠物照片" prop="fengmian">
									<img v-if="ruleForm.fengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fengmian.split(',')[0]" width="100" height="100">
									<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="baseUrl+item" width="100" height="100">
							</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="品种" prop="pinzhong">
							<el-input v-model="ruleForm.pinzhong" 
									placeholder="品种" clearable :disabled="true"></el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="性别" prop="xingbie">
							<el-select v-model="ruleForm.xingbie" placeholder="请选择性别" :disabled="true" >
								<el-option
										v-for="(item,index) in xingbieOptions"
										:key="index"
										:label="item"
										:value="item">
								</el-option>
							</el-select>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="年龄" prop="nianling">
							<el-input v-model="ruleForm.nianling" 
									placeholder="年龄" clearable :disabled="true"></el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="是否领养" prop="shifoulingyang">
							<el-select v-model="ruleForm.shifoulingyang" placeholder="请选择是否领养" :disabled="true" >
								<el-option
										v-for="(item,index) in shifoulingyangOptions"
										:key="index"
										:label="item"
										:value="item">
								</el-option>
							</el-select>
						</el-form-item>

						<el-form-item 
    :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' 
    label="是否审核" 
    prop="nianling"
>
    <el-input 
        v-model="ruleForm.sfsh" 
        placeholder="是否审核" 
        readonly 
    ></el-input>
</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="领养申请" prop="lingyangshenqing">
							<el-input
								type="textarea"
								:rows="8"
								placeholder="领养申请"
								v-model="ruleForm.lingyangshenqing">
							</el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="用户账号" prop="yonghuzhanghao">
							<el-input v-model="ruleForm.yonghuzhanghao" 
									placeholder="用户账号" clearable :disabled="true"></el-input>
						</el-form-item>
						<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="用户姓名" prop="yonghuxingming">
							<el-input v-model="ruleForm.yonghuxingming" 
									placeholder="用户姓名" clearable :disabled="true"></el-input>
						</el-form-item>

	
				<el-form-item :style='{"padding":"0","margin":"0"}'>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"6px","background":"#1e3c4f","width":"128px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
					<el-button :style='{"border":"1px solid #1e3c4f","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#1e3c4f","borderRadius":"6px","background":"none","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
				</el-form-item>
			</el-form>
	</div>
	</template>

	
	<script>
		export default {
			data() {
			let self = this
				return {
					crossTable: this.$route.query.crossTable || null,
					crossObj: this.$route.query.crossObj ? JSON.parse(this.$route.query.crossObj) : null,
					mid: localStorage.getItem('frontUserid') || '', // 当前用户ID
					id: '',
					baseUrl: '',
					ro:{
						chongwumingcheng : false,
						chongwuleixing : false,
						fengmian : false,
						pinzhong : false,
						xingbie : false,
						nianling : false,
						shifoulingyang : false,
						shangjiazhanghao : false,
						shangjiaxingming : false,
						lingyangshenqing : false,
						sfsh : false,
						shhf : false,
						yonghuzhanghao : false,
						yonghuxingming : false,
					},
					type: '',
					userTableName: localStorage.getItem('UserTableName'),
					ruleForm: {
						chongwumingcheng: '',
						chongwuleixing: '',
						fengmian: '',
						pinzhong: '',
						xingbie: '',
						nianling: '',
						shifoulingyang: '',
						shangjiazhanghao: '',
						shangjiaxingming: '',
						lingyangshenqing: '',
						sfsh: '待审核',
						shhf: '',
						yonghuzhanghao: '',
						yonghuxingming: '',
					},
					chongwuleixingOptions: [],
					xingbieOptions: ['公','母'],
					shifoulingyangOptions: ['是','否'],
	
					rules: {
						chongwumingcheng: [
						],
						chongwuleixing: [
						],
						fengmian: [
						],
						pinzhong: [
						],
						xingbie: [
						],
						nianling: [
						],
						shifoulingyang: [
						],
						shangjiazhanghao: [
						],
						shangjiaxingming: [
						],
						lingyangshenqing: [
						],
						sfsh: [
						],
						shhf: [
						],
						yonghuzhanghao: [
						],
						yonghuxingming: [
						],
					},
			centerType: false,
				};
			},
			computed: {
	
			},
			components: {
			},
			created() {
    if(this.$route.query.centerType) {
        this.centerType = true
    }
    
    // 获取传递过来的宠物信息
    if(this.$route.query.crossObj) {
        var obj = JSON.parse(this.$route.query.crossObj);
        for(var o in obj) {
            if(o === 'fengmian') {
                this.ruleForm.fengmian = obj[o];
                continue;
            }
            if(o === 'chongwumingcheng') {
                this.ruleForm.chongwumingcheng = obj[o];
                continue;
            }
            if(o === 'chongwuleixing') {
                this.ruleForm.chongwuleixing = obj[o];
                continue;
            }
            if(o === 'pinzhong') {
                this.ruleForm.pinzhong = obj[o];
                continue;
            }
            if(o === 'xingbie') {
                this.ruleForm.xingbie = obj[o];
                continue;
            }
            if(o === 'nianling') {
                this.ruleForm.nianling = obj[o];
                continue;
            }
						if(o === 'shifoulingyang') {
                this.ruleForm.shifoulingyang = obj[o];
                continue;
            }
            if(o === 'shangjiazhanghao') {
                this.ruleForm.shangjiazhanghao = obj[o];
                continue;
            }
            if(o === 'shangjiaxingming') {
                this.ruleForm.shangjiaxingming = obj[o];
                continue;
            }
        }
    }
    
    this.init();
},
			methods: {
				getMakeZero(s) {
						return s < 10 ? '0' + s : s;
				},
				// 下载
				download(file){
					window.open(`${file}`)
				},
				// 初始化
				init(type) {
					this.type = type;
					if(type=='cross'){
						var obj = JSON.parse(localStorage.getItem('crossObj'));
						for (var o in obj){
							if(o=='chongwumingcheng'){
								this.ruleForm.chongwumingcheng = obj[o];
								this.ro.chongwumingcheng = true;
								continue;
							}
							if(o=='chongwuleixing'){
								this.ruleForm.chongwuleixing = obj[o];
								this.ro.chongwuleixing = true;
								continue;
							}
							if(o=='fengmian'){
								this.ruleForm.fengmian = obj[o].split(",")[0];
								this.ro.fengmian = true;
								continue;
							}
							if(o=='pinzhong'){
								this.ruleForm.pinzhong = obj[o];
								this.ro.pinzhong = true;
								continue;
							}
							if(o=='xingbie'){
								this.ruleForm.xingbie = obj[o];
								this.ro.xingbie = true;
								continue;
							}
							if(o=='nianling'){
								this.ruleForm.nianling = obj[o];
								this.ro.nianling = true;
								continue;
							}
							if(o=='shifoulingyang'){
								this.ruleForm.shifoulingyang = obj[o];
								this.ro.shifoulingyang = true;
								continue;
							}
							if(o=='shangjiazhanghao'){
								this.ruleForm.shangjiazhanghao = obj[o];
								this.ro.shangjiazhanghao = true;
								continue;
							}
							if(o=='shangjiaxingming'){
								this.ruleForm.shangjiaxingming = obj[o];
								this.ro.shangjiaxingming = true;
								continue;
							}
							if(o=='lingyangshenqing'){
								this.ruleForm.lingyangshenqing = obj[o];
								this.ro.lingyangshenqing = true;
								continue;
							}
							if(o=='sfsh'){
								this.ruleForm.sfsh = obj[o];
								this.ro.sfsh = true;
								continue;
							}
							if(o=='shhf'){
								this.ruleForm.shhf = obj[o];
								this.ro.shhf = true;
								continue;
							}
							if(o=='yonghuzhanghao'){
								this.ruleForm.yonghuzhanghao = obj[o];
								this.ro.yonghuzhanghao = true;
								continue;
							}
							if(o=='yonghuxingming'){
								this.ruleForm.yonghuxingming = obj[o];
								this.ro.yonghuxingming = true;
								continue;
							}
						}
					}else if(type=='edit'){
				this.info()
			}
					// 获取用户信息
					this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
						if (res.data.code == 0) {
							var json = res.data.data;
							if((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0){
								this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
							}
							if((json.yonghuxingming!=''&&json.yonghuxingming) || json.yonghuxingming==0){
								this.ruleForm.yonghuxingming = json.yonghuxingming
							}
						}
					});
					this.$http.get('option/chongwuleixing/chongwuleixing', {emulateJSON: true}).then(res => {
						if (res.data.code == 0) {
							this.chongwuleixingOptions = res.data.data;
						}
					});
	
			if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
				localStorage.removeItem('raffleType')
				setTimeout(() => {
					this.onSubmit()
				}, 300)
			}
				},
	
				// 多级联动参数
				info() {
					this.$http.get(`chongwulingyang/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
						if (res.data.code == 0) {
							this.ruleForm = res.data.data;
						}
					});
				},
				// 提交
				onSubmit() {
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				this.$refs["ruleForm"].validate(valid => {
					if(valid) {
						if(this.type=='cross'){
							var statusColumnName = localStorage.getItem('statusColumnName');
							var statusColumnValue = localStorage.getItem('statusColumnValue');
							if(statusColumnName && statusColumnName!='') {
								var obj = JSON.parse(localStorage.getItem('crossObj'));
								if(!statusColumnName.startsWith("[")) {
									for (var o in obj){
										if(o==statusColumnName){
											obj[o] = statusColumnValue;
										}
									}
									var table = localStorage.getItem('crossTable');
									this.$http.post(table+'/update', obj).then(res => {});
								} else {
									crossuserid=Number(localStorage.getItem('frontUserid'));
									crossrefid=obj['id'];
									crossoptnum=localStorage.getItem('statusColumnName');
									crossoptnum=crossoptnum.replace(/$$/,"").replace(/$$/,"");
								}
							}
						}
						if(crossrefid && crossuserid) {
							this.ruleForm.crossuserid=crossuserid;
							this.ruleForm.crossrefid=crossrefid;
							var params = {
								page: 1,
								limit: 10,
								crossuserid:crossuserid,
								crossrefid:crossrefid,
							}
							this.$http.get('chongwulingyang/list', {
								params: params
							}).then(res => {
								if(res.data.data.total>=crossoptnum) {
									this.$message({
										message: localStorage.getItem('tips'),
										type: 'error',
										duration: 1500,
									});
									return false;
								} else {
									// 跨表计算
									if(this.ruleForm.yonghuzhanghao&& this.ruleForm.yonghuzhanghao!=null && this.ruleForm.yonghuzhanghao!=""){
										params["yonghuzhanghao"] = this.ruleForm.yonghuzhanghao;
									}
									if(this.ruleForm.yonghuxingming&& this.ruleForm.yonghuxingming!=null && this.ruleForm.yonghuxingming!=""){
										params["yonghuxingming"] = this.ruleForm.yonghuxingming;
									}
	
									this.$http.post(`chongwulingyang/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
										if (res.data.code == 0) {
											this.$message({
												message: '操作成功',
												type: 'success',
												duration: 1500,
												onClose: () => {
													this.$router.go(-1);
												}
											});
										} else {
											this.$message({
												message: res.data.msg,
												type: 'error',
												duration: 1500
											});
										}
									});
								}
							});
						} else {
	
							this.$http.post(`chongwulingyang/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
								if (res.data.code == 0) {
									this.$message({
										message: '操作成功',
										type: 'success',
										duration: 1500,
										onClose: () => {
											this.$router.go(-1);
										}
									});
								} else {
									this.$message({
										message: res.data.msg,
										type: 'error',
										duration: 1500
									
									});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
			fengmianUploadChange(fileUrls) {
					this.ruleForm.fengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
			},
		}
	};
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		font-weight: 500;
		width: 180px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
		margin-left: 180px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
		border-radius: 30px;
		padding: 0 12px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .5);
		color: #666;
		background: #fff;
		width: auto;
		font-size: 14px;
		border-color: #eee;
		border-width: 1px;
		border-style: solid;
		min-width: 300px;
		height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
		border-radius: 30px;
		padding: 0 12px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .5);
		color: #666;
		background: #fff;
		width: auto;
		font-size: 14px;
		border-color: #eee;
		border-width: 1px;
		border-style: solid;
		min-width: 300px;
		height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
		border-radius: 30px;
		padding: 0 10px;
		color: #666;
		background: #fff;
		width: auto;
		font-size: 14px;
		border-color: #eee;
		border-width: 1px;
		border-style: solid;
		min-width: 350px;
		height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
		border-radius: 30px;
		padding: 0 10px 0 30px;
		color: #666;
		background: #fff;
		width: auto;
		font-size: 14px;
		border-color: #eee;
		border-width: 1px;
		border-style: solid;
		min-width: 350px;
		height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
		cursor: pointer;
		color: #999;
		font-weight: 600;
		font-size: 24px;
		border-color: #eee;
		line-height: 60px;
		border-radius: 20px;
		background: #fff;
		width: 120px;
		border-width: 1px;
		border-style: solid;
		text-align: center;
		height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
		cursor: pointer;
		color: #999;
		font-weight: 600;
		font-size: 24px;
		border-color: #eee;
		line-height: 60px;
		border-radius: 20px;
		background: #fff;
		width: 120px;
		border-width: 1px;
		border-style: solid;
		text-align: center;
		height: 60px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
		cursor: pointer;
		color: #999;
		font-weight: 600;
		font-size: 24px;
		border-color: #eee;
		line-height: 60px;
		border-radius: 20px;
		background: #fff;
		width: 120px;
		border-width: 1px;
		border-style: solid;
		text-align: center;
		height: 60px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
		border: 1px solid #eee;
		border-radius: 20px;
		padding: 12px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .5);
		outline: none;
		color: #666;
		background: #fff;
		width: auto;
		font-size: 14px;
		min-width: 800px;
		height: 120px;
	}
</style>
