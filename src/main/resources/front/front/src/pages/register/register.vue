<template>
  <div>
    <div class="container" :style="{
      minHeight: '100vh',
      alignItems: 'center',
      background: 'url(https://img2.pconline.com.cn/pconline/0706/07/1031072_070611dog10.jpg)',
      display: 'flex',
      width: '100%',
      backgroundSize: 'cover',
      backgroundPosition: 'center center',
      backgroundRepeat: 'no-repeat',
      justifyContent: 'center'
    }">
    
      <el-form class='rgs-form' v-if="pageFlag=='register'" :style='{
        "padding":"40px 60px",
        "margin":"0",
        "borderRadius":"8px",
        "flexWrap":"wrap",
        "background":"rgba(255,255,255,0.9)",
        "display":"flex",
        "width":"450px",
        "position":"relative",
        "height":"auto",
        "backdropFilter":"blur(8px)",
        "border":"1px solid rgba(30,60,79,0.15)",
        "boxShadow":"0 4px 20px rgba(0,0,0,0.1)"
      }' ref="registerForm" :model="registerForm" :rules="rules">
        
        <div v-if="true" :style='{
          "margin":"0 auto 30px",
          "color":"#1e3c4f",
          "textAlign":"center",
          "width":"100%",
          "lineHeight":"1.5",
          "fontSize":"24px",
          "fontWeight":"600",
          "letterSpacing":"1px"
        }'>宠物寄养平台注册</div>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="yonghuzhanghao">
          <el-input v-model="registerForm.yonghuzhanghao" placeholder="请输入用户账号" :style='{
            "padding":"0 15px",
            "borderColor":"rgba(30,60,79,0.2)",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "borderWidth":"1px",
            "width":"100%",
            "fontSize":"14px",
            "borderStyle":"solid",
            "height":"46px",
            "background":"rgba(255,255,255,0.8)"
          }' prefix-icon="el-icon-user">
          </el-input>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="mima">
          <el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" :style='{
            "padding":"0 15px",
            "borderColor":"rgba(30,60,79,0.2)",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "borderWidth":"1px",
            "width":"100%",
            "fontSize":"14px",
            "borderStyle":"solid",
            "height":"46px",
            "background":"rgba(255,255,255,0.8)"
          }' prefix-icon="el-icon-lock">
          </el-input>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="mima2">
          <el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" :style='{
            "padding":"0 15px",
            "borderColor":"rgba(30,60,79,0.2)",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "borderWidth":"1px",
            "width":"100%",
            "fontSize":"14px",
            "borderStyle":"solid",
            "height":"46px",
            "background":"rgba(255,255,255,0.8)"
          }' prefix-icon="el-icon-lock">
          </el-input>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="touxiang">
          <file-upload
            tip="点击上传头像"
            action="file/upload"
            :limit="1"
            :multiple="true"
            :fileUrls="registerForm.touxiang?registerForm.touxiang:''"
            @change="yonghutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="yonghuxingming">
          <el-input v-model="registerForm.yonghuxingming" placeholder="请输入用户姓名" :style='{
            "padding":"0 15px",
            "borderColor":"rgba(30,60,79,0.2)",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "borderWidth":"1px",
            "width":"100%",
            "fontSize":"14px",
            "borderStyle":"solid",
            "height":"46px",
            "background":"rgba(255,255,255,0.8)"
          }' prefix-icon="el-icon-user">
          </el-input>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="xingbie">
          <el-select v-model="registerForm.xingbie" placeholder="请选择性别" :style='{
            "width":"100%",
            "borderColor":"rgba(30,60,79,0.2)"
          }'>
            <el-option
              v-for="(item,index) in yonghuxingbieOptions"
              :key="index"
              :label="item"
              :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        
        <el-form-item :style='{"width":"100%","margin":"0 auto 20px"}' v-if="tableName=='yonghu'" prop="shoujihaoma">
          <el-input v-model="registerForm.shoujihaoma" placeholder="请输入手机号码" :style='{
            "padding":"0 15px",
            "borderColor":"rgba(30,60,79,0.2)",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "borderWidth":"1px",
            "width":"100%",
            "fontSize":"14px",
            "borderStyle":"solid",
            "height":"46px",
            "background":"rgba(255,255,255,0.8)"
          }' prefix-icon="el-icon-phone">
          </el-input>
        </el-form-item>
        
        <el-button :style='{
          "border":"none",
          "cursor":"pointer",
          "padding":"0",
          "margin":"25px auto 15px",
          "outline":"none",
          "color":"#fff",
          "borderRadius":"4px",
          "background":"#1e3c4f",
          "width":"100%",
          "fontSize":"16px",
          "height":"46px",
          "transition":"all 0.3s",
          "&:hover":{
            "background":"rgba(30,60,79,0.8)",
            "transform":"translateY(-2px)",
            "boxShadow":"0 4px 8px rgba(30,60,79,0.2)"
          }
        }' type="primary" @click="submitForm('registerForm')">注册</el-button>
        
        <router-link :style='{
          "cursor":"pointer",
          "padding":"10px 0",
          "margin":"15px auto 0",
          "color":"#1e3c4f",
          "textAlign":"center",
          "display":"block",
          "width":"100%",
          "fontSize":"14px",
          "textDecoration":"none",
          "transition":"all 0.3s",
          "&:hover":{
            "color":"rgba(30,60,79,0.8)"
          }
        }' to="/login">已有账户？立即登录</router-link>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      pageFlag: '',
      tableName: '',
      registerForm: {},
      rules: {},
      requiredRules: {},
      yonghuxingbieOptions: [],
    }
  },
  mounted() {
    if(this.$route.query.pageFlag=='register'){
      this.tableName = this.$route.query.role;
      if(this.tableName=='yonghu'){
        this.registerForm = {
          yonghuzhanghao: '',
          mima: '',
          mima2: '',
          touxiang: '',
          yonghuxingming: '',
          xingbie: '',
          shoujihaoma: '',
          money: '',
        }
      }
      if ('yonghu' == this.tableName) {
        this.requiredRules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }]
      }
      if ('yonghu' == this.tableName) {
        this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
      }
      if ('yonghu' == this.tableName) {
        this.requiredRules.yonghuxingming = [{ required: true, message: '请输入用户姓名', trigger: 'blur' }]
      }
    }
  },
  created() {
    this.pageFlag = this.$route.query.pageFlag;
    if(this.$route.query.pageFlag=='register'){
      if ('yonghu' == this.tableName) {
        this.rules.yonghuzhanghao = [{ required: true, message: '请输入用户账号', trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.yonghuxingming = [{ required: true, message: '请输入用户姓名', trigger: 'blur' }];
      }
      this.yonghuxingbieOptions = "男,女".split(',');
      if ('yonghu' == this.tableName) {
        this.rules.shoujihaoma = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.money = [{ required: true, validator: this.$validate.isNumber, trigger: 'blur' }];
      }
    }
  },
  methods: {
    changeRules(name){
      if(this.requiredRules[name]){
        return true
      }
      return false
    },
    yonghutouxiangUploadChange(fileUrls) {
      this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
    },
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          var url=this.tableName+"/register";
          if((!this.registerForm.yonghuzhanghao) && `yonghu` == this.tableName){
            this.$message.error(`用户账号不能为空`);
            return
          }
          if(`yonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
            this.$message.error(`两次密码输入不一致`);
            return
          }
          if((!this.registerForm.mima) && `yonghu` == this.tableName){
            this.$message.error(`密码不能为空`);
            return
          }
          if((!this.registerForm.yonghuxingming) && `yonghu` == this.tableName){
            this.$message.error(`用户姓名不能为空`);
            return
          }
          if(`yonghu` == this.tableName && this.registerForm.shoujihaoma &&(!this.$validate.isMobile2(this.registerForm.shoujihaoma))){
            this.$message.error(`手机号码应输入手机格式`);
            return
          }
          this.$http.post(url, this.registerForm).then(res => {
            if (res.data.code === 0) {
              this.$message({
                message: '注册成功',
                type: 'success',
                duration: 1500,
                onClose: () => {
                  this.$router.push('/login');
                }
              });
            } else {
              this.$message.error(res.data.msg);
            }
          });
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>

<style scoped>
.container {
  position: relative;
  background: url('https://img2.pconline.com.cn/pconline/0706/07/1031072_070611dog10.jpg') no-repeat center center;
  background-size: cover;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
}

/* 输入框聚焦效果 */
.el-input /deep/ .el-input__inner:focus {
  border-color: rgba(30,60,79,0.4) !important;
  box-shadow: 0 0 5px rgba(30,60,79,0.1);
}

/* 下拉菜单样式 */
.el-select-dropdown {
  border: 1px solid rgba(30,60,79,0.15) !important;
  box-shadow: 0 4px 12px rgba(0,0,0,0.1) !important;
}

.el-select-dropdown__item {
  color: #1e3c4f !important;
  padding: 10px 15px !important;
}

.el-select-dropdown__item.hover, 
.el-select-dropdown__item:hover {
  background-color: rgba(30,60,79,0.1) !important;
}

/* 上传组件样式 */
.file-upload /deep/ .el-upload {
  border: 1px dashed rgba(30,60,79,0.2) !important;
  border-radius: 4px !important;
  background: rgba(255,255,255,0.7) !important;
  transition: all 0.3s;
}

.file-upload /deep/ .el-upload:hover {
  border-color: rgba(30,60,79,0.4) !important;
}
</style>