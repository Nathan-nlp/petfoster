import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusschongwuchanpin from '@/views/modules/discusschongwuchanpin/list'
    import chongwuxinxi from '@/views/modules/chongwuxinxi/list'
    import chongwulingyang from '@/views/modules/chongwulingyang/list'
    import chongwuleixing from '@/views/modules/chongwuleixing/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shangjia from '@/views/modules/shangjia/list'
    import chongwufenxiang from '@/views/modules/chongwufenxiang/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import yanghufenlei from '@/views/modules/yanghufenlei/list'
    import discusschongwuyanghuzhishi from '@/views/modules/discusschongwuyanghuzhishi/list'
    import discusssijiyangchong from '@/views/modules/discusssijiyangchong/list'
    import chongwuchanpin from '@/views/modules/chongwuchanpin/list'
    import forum from '@/views/modules/forum/list'
    import chanpinfenlei from '@/views/modules/chanpinfenlei/list'
    import discusschongwufenxiang from '@/views/modules/discusschongwufenxiang/list'
    import discusschongwuxinxi from '@/views/modules/discusschongwuxinxi/list'
    import chongwuyanghuzhishi from '@/views/modules/chongwuyanghuzhishi/list'
    import chat from '@/views/modules/chat/list'
    import sijiyangchong from '@/views/modules/sijiyangchong/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusschongwuchanpin',
        name: '宠物产品评论',
        component: discusschongwuchanpin
      }
      ,{
	path: '/chongwuxinxi',
        name: '宠物信息',
        component: chongwuxinxi
      }
      ,{
        path: '/chongwulingyang',
              name: '宠物领养',
              component: chongwulingyang
            }
      
      ,{
	path: '/chongwuleixing',
        name: '宠物类型',
        component: chongwuleixing
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
        path: '/shangjia',
              name: '商家',
              component: shangjia
            }
      ,{
	path: '/chongwufenxiang',
        name: '宠物分享',
        component: chongwufenxiang
      }
     
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/yanghufenlei',
        name: '养护分类',
        component: yanghufenlei
      }
      ,{
	path: '/discusschongwuyanghuzhishi',
        name: '宠物养护知识评论',
        component: discusschongwuyanghuzhishi
      }
      ,{
	path: '/discusssijiyangchong',
        name: '四季养宠评论',
        component: discusssijiyangchong
      }
      ,{
	path: '/chongwuchanpin',
        name: '宠物产品',
        component: chongwuchanpin
      }
      ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
      ,{
	path: '/chanpinfenlei',
        name: '产品分类',
        component: chanpinfenlei
      }
      ,{
	path: '/discusschongwufenxiang',
        name: '宠物分享评论',
        component: discusschongwufenxiang
      }
      ,{
	path: '/discusschongwuxinxi',
        name: '宠物信息评论',
        component: discusschongwuxinxi
      }
      
      ,{
	path: '/chongwuyanghuzhishi',
        name: '宠物养护知识',
        component: chongwuyanghuzhishi
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/sijiyangchong',
        name: '四季养宠',
        component: sijiyangchong
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
