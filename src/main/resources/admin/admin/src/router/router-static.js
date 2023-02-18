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
    import news from '@/views/modules/news/list'
    import kechengdingdan from '@/views/modules/kechengdingdan/list'
    import jiajiaolaoshi from '@/views/modules/jiajiaolaoshi/list'
    import kechengleibie from '@/views/modules/kechengleibie/list'
    import discussjiajiaozhaopin from '@/views/modules/discussjiajiaozhaopin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jiajiaozhaopin from '@/views/modules/jiajiaozhaopin/list'
    import jiajiaopingjia from '@/views/modules/jiajiaopingjia/list'
    import yingpinxinxi from '@/views/modules/yingpinxinxi/list'
    import discusskechengxinxi from '@/views/modules/discusskechengxinxi/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
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
	path: '/news',
        name: '网站公告',
        component: news
      }
      ,{
	path: '/kechengdingdan',
        name: '课程订单',
        component: kechengdingdan
      }
      ,{
	path: '/jiajiaolaoshi',
        name: '家教老师',
        component: jiajiaolaoshi
      }
      ,{
	path: '/kechengleibie',
        name: '课程类别',
        component: kechengleibie
      }
      ,{
	path: '/discussjiajiaozhaopin',
        name: '家教招聘评论',
        component: discussjiajiaozhaopin
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jiajiaozhaopin',
        name: '家教招聘',
        component: jiajiaozhaopin
      }
      ,{
	path: '/jiajiaopingjia',
        name: '家教评价',
        component: jiajiaopingjia
      }
      ,{
	path: '/yingpinxinxi',
        name: '应聘信息',
        component: yingpinxinxi
      }
      ,{
	path: '/discusskechengxinxi',
        name: '课程信息评论',
        component: discusskechengxinxi
      }
      ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
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
