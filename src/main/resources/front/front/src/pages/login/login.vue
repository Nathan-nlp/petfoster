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
    
      <el-form ref="loginForm" :model="loginForm" :style='{
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
      }' :rules="rules">
        
        <div v-if="true" :style='{
          "margin":"0 auto 30px",
          "color":"#1e3c4f",
          "textAlign":"center",
          "width":"100%",
          "lineHeight":"1.5",
          "fontSize":"24px",
          "fontWeight":"600",
          "letterSpacing":"1px"
        }'>宠物寄养平台登录</div>
        
        <el-form-item v-if="loginType==1" class="list-item" :style='{"width":"100%","margin":"0 auto 20px"}' prop="username">
          <el-input :style='{
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
          }' v-model="loginForm.username" placeholder="请输入账号" >
          </el-input>
        </el-form-item>
        
        <el-form-item v-if="loginType==1" class="list-item" :style='{"width":"100%","margin":"0 auto 20px"}' prop="password">
          <el-input :style='{
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
          }' v-model="loginForm.password" placeholder="请输入密码" type="password" >
          </el-input>
        </el-form-item>

        <el-form-item class="list-type select" :style='{"width":"100%","margin":"0 auto 20px"}' v-if="roles.length>1">
          <el-select v-model="loginForm.tableName" placeholder="请选择角色" @change="selectChange" :style='{
            "width":"100%",
            "borderColor":"rgba(30,60,79,0.2)"
          }'>
            <el-option v-for="item,index in roles" :key="index" :label="item.roleName" :value="item.tableName" />
          </el-select>
        </el-form-item>

        <el-form-item class="list-btn" :style='{"width":"100%","margin":"25px auto 15px"}'>
          <el-button v-if="loginType==1" :style='{
            "border":"none",
            "cursor":"pointer",
            "padding":"0",
            "margin":"0",
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
          }' @click="submitForm('loginForm')">登 录</el-button>
        </el-form-item>
        
        <div :style='{
          "width":"100%",
          "margin":"15px auto 0",
          "flexWrap":"wrap",
          "background":"none",
          "display":"flex",
          "justifyContent":"center",
          "fontSize":"14px"
        }'>
          <router-link :style='{
            "cursor":"pointer",
            "padding":"8px 15px",
            "margin":"0 5px",
            "color":"#1e3c4f",
            "borderRadius":"4px",
            "background":"none",
            "textDecoration":"none",
            "transition":"all 0.3s",
            "&:hover":{
              "color":"#fff",
              "background":"#1e3c4f"
            }
          }' :to="{path: '/register', query: {role: item.tableName,pageFlag:'register'}}" 
          v-if="item.hasFrontRegister=='是'" 
          v-for="(item, index) in roles" 
          :key="index">
            注册{{item.roleName.replace('注册','')}}
          </router-link>
        </div>
      </el-form>
    </div>
  </div>
</template>

<script>
import menu from '@/config/menu'
export default {
  data() {
    return {
      baseUrl: this.$config.baseUrl,
      loginType: 1,
      roleMenus: [],
      loginForm: {
        username: '',
        password: '',
        tableName: '',
      },
      role: '',
      roles: [],
      rules: {
        username: [
          { required: true, message: '请输入账号', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' }
        ]
      }
    }
  },
  components: {
  },
  created() {
    this.roleMenus = menu.list()
    for(let item in this.roleMenus) {
      if(this.roleMenus[item].hasFrontLogin=='是') {
        this.roles.push(this.roleMenus[item]);
      }
    }
  },
  methods: {
    selectChange(e){
      for(let x in this.roles){
        if(this.roles[x].tableName == e){
          this.role = this.roles[x].roleName
        }
      }
    },
    submitForm(formName) {
      if (this.roles.length!=1) {
        if (!this.role) {
          this.$message.error("请选择登录用户类型");
          return false;
        }
      } else {
        this.role = this.roles[0].roleName;
        this.loginForm.tableName = this.roles[0].tableName;
      }
      this.loginPost(formName)
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    loginPost(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.$http.get(`${this.loginForm.tableName}/login`, {params: this.loginForm}).then(res => {
            if (res.data.code === 0) {
              localStorage.setItem('frontToken', res.data.token);
              localStorage.setItem('UserTableName', this.loginForm.tableName);
              localStorage.setItem('username', this.loginForm.username);
              localStorage.setItem('frontSessionTable', this.loginForm.tableName);
              localStorage.setItem('frontRole', this.role);
              localStorage.setItem('keyPath', 0);
              this.$router.push('/');
              this.$message({
                message: '登录成功',
                type: 'success',
                duration: 1500,
              });
            } else {
              this.$message.error(res.data.msg);
            }
          });
        }
      });
    },
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
</style>