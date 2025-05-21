import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yanghufenleiList from '../pages/yanghufenlei/list'
import yanghufenleiDetail from '../pages/yanghufenlei/detail'
import yanghufenleiAdd from '../pages/yanghufenlei/add'
import chanpinfenleiList from '../pages/chanpinfenlei/list'
import chanpinfenleiDetail from '../pages/chanpinfenlei/detail'
import chanpinfenleiAdd from '../pages/chanpinfenlei/add'
import chongwuleixingList from '../pages/chongwuleixing/list'
import chongwuleixingDetail from '../pages/chongwuleixing/detail'
import chongwuleixingAdd from '../pages/chongwuleixing/add'
import chongwuxinxiList from '../pages/chongwuxinxi/list'
import chongwuxinxiDetail from '../pages/chongwuxinxi/detail'
import chongwuxinxiAdd from '../pages/chongwuxinxi/add'
import chongwulingyangList from '../pages/chongwulingyang/list'
import chongwulingyangDetail from '../pages/chongwulingyang/detail'
import chongwulingyangAdd from '../pages/chongwulingyang/add'
import chongwuyanghuzhishiList from '../pages/chongwuyanghuzhishi/list'
import chongwuyanghuzhishiDetail from '../pages/chongwuyanghuzhishi/detail'
import chongwuyanghuzhishiAdd from '../pages/chongwuyanghuzhishi/add'
import chongwufenxiangList from '../pages/chongwufenxiang/list'
import chongwufenxiangDetail from '../pages/chongwufenxiang/detail'
import chongwufenxiangAdd from '../pages/chongwufenxiang/add'
import sijiyangchongList from '../pages/sijiyangchong/list'
import sijiyangchongDetail from '../pages/sijiyangchong/detail'
import sijiyangchongAdd from '../pages/sijiyangchong/add'
import chongwuchanpinList from '../pages/chongwuchanpin/list'
import chongwuchanpinDetail from '../pages/chongwuchanpin/detail'
import chongwuchanpinAdd from '../pages/chongwuchanpin/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discusschongwuxinxiList from '../pages/discusschongwuxinxi/list'
import discusschongwuxinxiDetail from '../pages/discusschongwuxinxi/detail'
import discusschongwuxinxiAdd from '../pages/discusschongwuxinxi/add'
import discusschongwuyanghuzhishiList from '../pages/discusschongwuyanghuzhishi/list'
import discusschongwuyanghuzhishiDetail from '../pages/discusschongwuyanghuzhishi/detail'
import discusschongwuyanghuzhishiAdd from '../pages/discusschongwuyanghuzhishi/add'
import discusschongwufenxiangList from '../pages/discusschongwufenxiang/list'
import discusschongwufenxiangDetail from '../pages/discusschongwufenxiang/detail'
import discusschongwufenxiangAdd from '../pages/discusschongwufenxiang/add'
import discusssijiyangchongList from '../pages/discusssijiyangchong/list'
import discusssijiyangchongDetail from '../pages/discusssijiyangchong/detail'
import discusssijiyangchongAdd from '../pages/discusssijiyangchong/add'
import discusschongwuchanpinList from '../pages/discusschongwuchanpin/list'
import discusschongwuchanpinDetail from '../pages/discusschongwuchanpin/detail'
import discusschongwuchanpinAdd from '../pages/discusschongwuchanpin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yanghufenlei',
					component: yanghufenleiList
				},
				{
					path: 'yanghufenleiDetail',
					component: yanghufenleiDetail
				},
				{
					path: 'yanghufenleiAdd',
					component: yanghufenleiAdd
				},
				{
					path: 'chanpinfenlei',
					component: chanpinfenleiList
				},
				{
					path: 'chanpinfenleiDetail',
					component: chanpinfenleiDetail
				},
				{
					path: 'chanpinfenleiAdd',
					component: chanpinfenleiAdd
				},
				{
					path: 'chongwuleixing',
					component: chongwuleixingList
				},
				{
					path: 'chongwuleixingDetail',
					component: chongwuleixingDetail
				},
				{
					path: 'chongwuleixingAdd',
					component: chongwuleixingAdd
				},
				{
					path: 'chongwuxinxi',
					component: chongwuxinxiList
				},
				{
					path: 'chongwuxinxiDetail',
					component: chongwuxinxiDetail
				},
				{
					path: 'chongwuxinxiAdd',
					component: chongwuxinxiAdd
				},
				
				{
					path: 'chongwulingyang',
					component: chongwulingyangList
				},
				{
					path: 'chongwulingyangDetail',
					component: chongwulingyangDetail
				},
				{
					path: 'chongwulingyangAdd',
					component: chongwulingyangAdd
				},
				{
					path: 'chongwuyanghuzhishi',
					component: chongwuyanghuzhishiList
				},
				{
					path: 'chongwuyanghuzhishiDetail',
					component: chongwuyanghuzhishiDetail
				},
				{
					path: 'chongwuyanghuzhishiAdd',
					component: chongwuyanghuzhishiAdd
				},
				{
					path: 'chongwufenxiang',
					component: chongwufenxiangList
				},
				{
					path: 'chongwufenxiangDetail',
					component: chongwufenxiangDetail
				},
				{
					path: 'chongwufenxiangAdd',
					component: chongwufenxiangAdd
				},
			
				{
					path: 'sijiyangchong',
					component: sijiyangchongList
				},
				{
					path: 'sijiyangchongDetail',
					component: sijiyangchongDetail
				},
				{
					path: 'sijiyangchongAdd',
					component: sijiyangchongAdd
				},
				{
					path: 'chongwuchanpin',
					component: chongwuchanpinList
				},
				{
					path: 'chongwuchanpinDetail',
					component: chongwuchanpinDetail
				},
				{
					path: 'chongwuchanpinAdd',
					component: chongwuchanpinAdd
				},
				
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discusschongwuxinxi',
					component: discusschongwuxinxiList
				},
				{
					path: 'discusschongwuxinxiDetail',
					component: discusschongwuxinxiDetail
				},
				{
					path: 'discusschongwuxinxiAdd',
					component: discusschongwuxinxiAdd
				},
				
				{
					path: 'discusschongwuyanghuzhishi',
					component: discusschongwuyanghuzhishiList
				},
				{
					path: 'discusschongwuyanghuzhishiDetail',
					component: discusschongwuyanghuzhishiDetail
				},
				{
					path: 'discusschongwuyanghuzhishiAdd',
					component: discusschongwuyanghuzhishiAdd
				},
				{
					path: 'discusschongwufenxiang',
					component: discusschongwufenxiangList
				},
				{
					path: 'discusschongwufenxiangDetail',
					component: discusschongwufenxiangDetail
				},
				{
					path: 'discusschongwufenxiangAdd',
					component: discusschongwufenxiangAdd
				},
				{
					path: 'discusssijiyangchong',
					component: discusssijiyangchongList
				},
				{
					path: 'discusssijiyangchongDetail',
					component: discusssijiyangchongDetail
				},
				{
					path: 'discusssijiyangchongAdd',
					component: discusssijiyangchongAdd
				},
				{
					path: 'discusschongwuchanpin',
					component: discusschongwuchanpinList
				},
				{
					path: 'discusschongwuchanpinDetail',
					component: discusschongwuchanpinDetail
				},
				{
					path: 'discusschongwuchanpinAdd',
					component: discusschongwuchanpinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
