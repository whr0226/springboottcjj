import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jiajiaolaoshiList from '../pages/jiajiaolaoshi/list'
import jiajiaolaoshiDetail from '../pages/jiajiaolaoshi/detail'
import jiajiaolaoshiAdd from '../pages/jiajiaolaoshi/add'
import jiajiaozhaopinList from '../pages/jiajiaozhaopin/list'
import jiajiaozhaopinDetail from '../pages/jiajiaozhaopin/detail'
import jiajiaozhaopinAdd from '../pages/jiajiaozhaopin/add'
import yingpinxinxiList from '../pages/yingpinxinxi/list'
import yingpinxinxiDetail from '../pages/yingpinxinxi/detail'
import yingpinxinxiAdd from '../pages/yingpinxinxi/add'
import kechengleibieList from '../pages/kechengleibie/list'
import kechengleibieDetail from '../pages/kechengleibie/detail'
import kechengleibieAdd from '../pages/kechengleibie/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import kechengdingdanList from '../pages/kechengdingdan/list'
import kechengdingdanDetail from '../pages/kechengdingdan/detail'
import kechengdingdanAdd from '../pages/kechengdingdan/add'
import jiajiaopingjiaList from '../pages/jiajiaopingjia/list'
import jiajiaopingjiaDetail from '../pages/jiajiaopingjia/detail'
import jiajiaopingjiaAdd from '../pages/jiajiaopingjia/add'

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
					path: 'storeup',
					component: Storeup
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
					path: 'jiajiaolaoshi',
					component: jiajiaolaoshiList
				},
				{
					path: 'jiajiaolaoshiDetail',
					component: jiajiaolaoshiDetail
				},
				{
					path: 'jiajiaolaoshiAdd',
					component: jiajiaolaoshiAdd
				},
				{
					path: 'jiajiaozhaopin',
					component: jiajiaozhaopinList
				},
				{
					path: 'jiajiaozhaopinDetail',
					component: jiajiaozhaopinDetail
				},
				{
					path: 'jiajiaozhaopinAdd',
					component: jiajiaozhaopinAdd
				},
				{
					path: 'yingpinxinxi',
					component: yingpinxinxiList
				},
				{
					path: 'yingpinxinxiDetail',
					component: yingpinxinxiDetail
				},
				{
					path: 'yingpinxinxiAdd',
					component: yingpinxinxiAdd
				},
				{
					path: 'kechengleibie',
					component: kechengleibieList
				},
				{
					path: 'kechengleibieDetail',
					component: kechengleibieDetail
				},
				{
					path: 'kechengleibieAdd',
					component: kechengleibieAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'kechengdingdan',
					component: kechengdingdanList
				},
				{
					path: 'kechengdingdanDetail',
					component: kechengdingdanDetail
				},
				{
					path: 'kechengdingdanAdd',
					component: kechengdingdanAdd
				},
				{
					path: 'jiajiaopingjia',
					component: jiajiaopingjiaList
				},
				{
					path: 'jiajiaopingjiaDetail',
					component: jiajiaopingjiaDetail
				},
				{
					path: 'jiajiaopingjiaAdd',
					component: jiajiaopingjiaAdd
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
