<template>
	<div>
		<div class="container" :style='{
  "minHeight":"100vh",
  "alignItems":"center",
  "background":"url(https://img2.pconline.com.cn/pconline/0706/07/1031072_070611dog10.jpg)",
  "display":"flex",
  "width":"100%",
  "backgroundSize":"cover",
  "backgroundPosition":"center center",
  "backgroundRepeat":"no-repeat",
  "justifyContent":"flex-end"
}'>
	
			<el-form v-if="pageFlag=='register'" :style='{"border":"1px solid rgba(255,255,255,0.3)","padding":"40px 80px","margin":"0","alignItems":"center","textAlign":"center","flexDirection":"column","display":"flex","justifyContent":"center","minHeight":"100vh","borderRadius":"8px","flexWrap":"wrap","background":"rgba(255,255,255,0.8)","width":"33%","position":"relative","height":"auto","backdropFilter":"blur(5px)"}' ref="rgsForm" class="rgs-form" :model="rgsForm" :rules="rules">
				<div v-if="true" :style='{"padding":"0 0 10px","margin":"0 0 20px","borderColor":"rgba(83,209,146,0.5)","color":"#53d192","textAlign":"center","display":"inline-block","background":"none","borderWidth":"0 0 2px","width":"100%","lineHeight":"1.2","fontSize":"22px","borderStyle":"solid","fontWeight":"500"}' class="title">基于Web的宠物寄养平台注册</div>
				
				<!-- 用户注册表单 -->
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='yonghu'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('yonghuzhanghao')?'required':''">用户账号：</div>
					<el-input  v-model="ruleForm.yonghuzhanghao"  autocomplete="off" placeholder="用户账号"  type="text"  />
				</el-form-item>
				<!-- 其他用户表单字段... -->

				<!-- 商家注册表单 -->
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('shangjiazhanghao')?'required':''">商家账号：</div>
					<el-input  v-model="ruleForm.shangjiazhanghao"  autocomplete="off" placeholder="商家账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="shangjiatouxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('shangjiaxingming')?'required':''">商家姓名：</div>
					<el-input  v-model="ruleForm.shangjiaxingming"  autocomplete="off" placeholder="商家姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
					<el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
						<el-option
							v-for="(item,index) in shangjiaxingbieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0","margin":"0 0 20px","textAlign":"left","flexWrap":"wrap","display":"flex","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='shangjia'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#53d192","textAlign":"right","left":"-120px","display":"inline-block","width":"120px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('shoujihaoma')?'required':''">手机号码：</div>
					<el-input  v-model="ruleForm.shoujihaoma"  autocomplete="off" placeholder="手机号码"  type="text"  />
				</el-form-item>

				<button :style='{"border":"none","cursor":"pointer","padding":"0 20px","margin":"20px 0 0","color":"#fff","display":"inline-block","letterSpacing":"4px","borderRadius":"6px","background":"#53d192","width":"100%","fontSize":"16px","height":"40px","boxShadow":"0 2px 4px rgba(83,209,146,0.3)"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0","margin":"20px 0 0","color":"rgba(83,209,146,0.8)","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"40px","fontSize":"14px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
		</div>
	</div>
</template>

<script>
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
            yonghuxingbieOptions: [],
            shangjiaxingbieOptions: [],
		};
	},
	mounted(){
    this.pageFlag = this.$route.query.pageFlag
    if(this.$route.query.pageFlag=='register'){
        
        let table = this.$storage.get("loginTable");
        this.tableName = table;
        if(this.tableName=='yonghu'){
            this.ruleForm = {
                yonghuzhanghao: '',
                mima: '',
                touxiang: '',
                yonghuxingming: '',
                xingbie: '',
                shoujihaoma: '',
                money: '',
            }
        }
        // 添加商家表单初始化
        if(this.tableName=='shangjia'){
            this.ruleForm = {
                shangjiazhanghao: '',
                mima: '',
                touxiang: '',
                shangjiaxingming: '',
                xingbie: '',
                shoujihaoma: '',
                money: '',
            }
        }
        if ('yonghu' == this.tableName) {
            this.rules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }]
        }
        if ('yonghu' == this.tableName) {
            this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
        }
        if ('yonghu' == this.tableName) {
            this.rules.yonghuxingming = [{ required: true, message: '请输入用户姓名', trigger: 'blur' }]
        }
        // 添加商家表单验证规则
        if ('shangjia' == this.tableName) {
            this.rules.shangjiazhanghao = [{ required: true, message: '请输入商家账号', trigger: 'blur' }]
        }
        if ('shangjia' == this.tableName) {
            this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
        }
        if ('shangjia' == this.tableName) {
            this.rules.shangjiaxingming = [{ required: true, message: '请输入商家姓名', trigger: 'blur' }]
        }
        this.yonghuxingbieOptions = "男,女".split(',')
        this.shangjiaxingbieOptions = "男,女".split(',')
    }
},

	created() {
	},
	destroyed() {
		  	},
	methods: {
		shangjiatouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        yonghutouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
						this.$message.error(`用户账号不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `yonghu` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `yonghu` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
						this.$message.error(`用户姓名不能为空`);
						return
					}
					if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma &&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
						this.$message.error(`手机号码应输入手机格式`);
						return
					}
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url('https://img2.pconline.com.cn/pconline/0706/07/1031072_070611dog10.jpg');
	  background-size: cover;
	  background-position: center;
	  background-repeat: no-repeat;
	  min-height: 100vh;
	  display: flex;
	  justify-content: flex-end;
	  align-items: center;

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						color: #666;
						background: rgba(255,255,255,0.7);
						width: 100%;
						font-size: 14px;
						border-color: rgba(83,209,146,0.5);
						border-width: 1px;
						border-style: solid;
						min-width: 20vw;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						color: #666;
						background: rgba(255,255,255,0.7);
						width: 100%;
						font-size: 14px;
						border-color: rgba(83,209,146,0.5);
						border-width: 1px;
						border-style: solid;
						min-width: 20vw;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						margin: 0 0 10px;
						color: #666;
						background: rgba(255,255,255,0.7);
						width: 100%;
						font-size: 14px;
						border-color: rgba(83,209,146,0.5);
						border-width: 1px;
						border-style: solid;
						min-width: 20vw;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 1px solid rgba(83,209,146,0.5);
			border-radius: 4px;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
			background: rgba(255,255,255,0.7);
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid rgba(83,209,146,0.5);
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #666;
		  		  background: rgba(255,255,255,0.7);
		  		  font-weight: 600;
		  		  width: 100px;
		  		  font-size: 14px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid rgba(83,209,146,0.5);
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #666;
		  		  background: rgba(255,255,255,0.7);
		  		  font-weight: 600;
		  		  width: 100px;
		  		  font-size: 14px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid rgba(83,209,146,0.5);
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #666;
		  		  background: rgba(255,255,255,0.7);
		  		  font-weight: 600;
		  		  width: 100px;
		  		  font-size: 14px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				position: absolute;
				right: 3px;
				content: "*";
				order: 3;
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>