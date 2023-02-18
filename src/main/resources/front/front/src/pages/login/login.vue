<template>
<div>
	<div class="container" :style='{"minHeight":"100vh","backgroundColor":"0","alignItems":"center","backgroundImage":"url(http://codegen.caihongy.cn/20221024/23b37078fa41495b866fda764fd3ea28.png)","display":"flex","width":"100%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form ref="loginForm" :model="loginForm" :style='{"padding":"40px 20px 20px","borderRadius":"10px","left":"565px","background":"#fff","width":"750px","position":"absolute","height":"845px"}' :rules="rules">
			<div v-if="true" :style='{"width":"100%","margin":"120px 0 10px 0","lineHeight":"44px","fontSize":"36px","color":"#000000","textAlign":"center"}'>USER / LOGIN</div>
			<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#000","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"36px","fontWeight":"600"}'>基于springboot的同城家教系统的设计与实现.登录</div>
			<el-form-item class="list-item" :style='{"width":"80%","margin":"30px auto 30px"}' prop="username">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>账号：</div>
				<input :style='{"border":"1px solid rgba(204, 204, 204, 1)","padding":"0 10px","color":"rgba(153, 153, 153, 1)","outlineOffset":"4px","borderRadius":"6px","width":"100%","fontSize":"18px","height":"44px"}' v-model="loginForm.username" placeholder="请输入账户">
			</el-form-item>
			<el-form-item class="list-item" :style='{"width":"80%","margin":"30px auto 30px"}' prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<input :style='{"border":"1px solid rgba(204, 204, 204, 1)","padding":"0 10px","color":"rgba(153, 153, 153, 1)","outlineOffset":"4px","borderRadius":"6px","width":"100%","fontSize":"18px","height":"44px"}' v-model="loginForm.password" placeholder="请输入密码" type="password">
			</el-form-item>
			<el-form-item v-if="roles.length>1" class="list-type" :style='{"width":"80%","margin":"20px auto"}' prop="role">
				<el-radio v-model="loginForm.tableName" :label="item.tableName" v-for="(item, index) in roles" :key="index" @change.native="getCurrentRow(item)">{{item.roleName}}</el-radio>
			</el-form-item>
			<el-form-item :style='{"width":"80%","margin":"20px auto"}'>
				<el-button :style='{"border":"none","cursor":"pointer","padding":"0 24px","margin":"10px 5px","color":"#fff","borderRadius":"8px","background":"rgba(0, 0, 0, 1)","width":"100%","fontSize":"16px","height":"44px"}' @click="submitForm('loginForm')">登录</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 24px","margin":"0 5px","outline":"none","color":"#000","borderRadius":"6px","background":"none","width":"100%","fontSize":"16px","height":"44px"}' @click="resetForm('loginForm')">重置</el-button>
			</el-form-item>
			<div :style='{"width":"80%","margin":"20px auto"}'>
			<router-link :style='{"cursor":"pointer","margin":"0 5px","fontSize":"14px","textDecoration":"none","color":"rgba(40, 40, 40, 1)","background":"#fff"}' :to="{path: '/register', query: {role: item.tableName,pageFlag:'register'}}" v-if="item.hasFrontRegister=='是'" v-for="(item, index) in roles" :key="index">注册{{item.roleName.replace('注册','')}}</router-link>
			</div>
		</el-form>
    </div>
</div>
</template>

<script>


export default {
	//数据集合
	data() {
		return {
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"家教老师","menuJump":"列表","tableName":"jiajiaolaoshi"}],"menu":"家教老师管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论"],"menu":"家教招聘","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","审核"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"课程类别","menuJump":"列表","tableName":"kechengleibie"}],"menu":"课程类别管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","教师业绩"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","满意度统计"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"网站公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","支付","评价"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论","修改"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","审核","教师业绩"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","满意度统计"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家教老师","tableName":"jiajiaolaoshi"}],
			loginForm: {
				username: '',
				password: '',
				tableName: '',
				code: '',
			},
			role: '',
            roles: [],
			rules: {
				username: [
					{ required: true, message: '请输入账户', trigger: 'blur' }
				],
				password: [
					{ required: true, message: '请输入密码', trigger: 'blur' }
				]
			},
			codes: [{
				num: 1,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 2,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 3,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 4,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}]
		}
	},
	created() {
        for(let item in this.roleMenus) {
            if(this.roleMenus[item].hasFrontLogin=='是') {
                this.roles.push(this.roleMenus[item]);
            }
        }
	},
	mounted() {
	},
    //方法集合
    methods: {
		randomString() {
			var len = 4;
			var chars = [
			  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
			  '3', '4', '5', '6', '7', '8', '9'
			]
			var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
			var sizes = ['14', '15', '16', '17', '18']
			
			var output = []
			for (var i = 0; i < len; i++) {
			  // 随机验证码
			  var key = Math.floor(Math.random() * chars.length)
			  this.codes[i].num = chars[key]
			  // 随机验证码颜色
			  var code = '#'
			  for (var j = 0; j < 6; j++) {
			    var key = Math.floor(Math.random() * colors.length)
			    code += colors[key]
			  }
			  this.codes[i].color = code
			  // 随机验证码方向
			  var rotate = Math.floor(Math.random() * 45)
			  var plus = Math.floor(Math.random() * 2)
			  if (plus == 1) rotate = '-' + rotate
			  this.codes[i].rotate = 'rotate(' + rotate + 'deg)'
			  // 随机验证码字体大小
			  var size = Math.floor(Math.random() * sizes.length)
			  this.codes[i].size = sizes[size] + 'px'
			}
		},
      getCurrentRow(row) {
        this.role = row.roleName;
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
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.get(`${this.loginForm.tableName}/login`, {params: this.loginForm}).then(res => {
              if (res.data.code === 0) {
                localStorage.setItem('Token', res.data.token);
                localStorage.setItem('UserTableName', this.loginForm.tableName);
                localStorage.setItem('username', this.loginForm.username);
                localStorage.setItem('adminName', this.loginForm.username);
                localStorage.setItem('sessionTable', this.loginForm.tableName);
                localStorage.setItem('role', this.role);
                localStorage.setItem('keyPath', this.$config.indexNav.length+2);
                this.$router.push('/index/center');
                this.$message({
                  message: '登录成功',
                  type: 'success',
                  duration: 1500,
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		
		.el-form-item {
		  & /deep/ .el-form-item__content {
		    width: 100%;
		  }
		}
		
		.list-item /deep/ .el-input .el-input__inner {
			border: 1px solid rgba(204, 204, 204, 1);
			border-radius: 6px;
			padding: 0 10px;
			color: rgba(153, 153, 153, 1);
			width: 100%;
			font-size: 18px;
			outline-offset: 4px;
			height: 44px;
		}
		
		.list-code /deep/ .el-input .el-input__inner {
			border-radius: 6px;
			padding: 0 10px;
			outline: none;
			color: rgba(153, 153, 153, 1);
			display: inline-block;
			vertical-align: middle;
			width: calc(100% - 160px);
			font-size: 16px;
			border-color: rgba(204, 204, 204,1);
			border-width: 1px;
			border-style: solid;
			height: 44px;
		}
		
		.list-type /deep/ .el-radio__input .el-radio__inner {
			border-color: #666666;
		}
		.list-type /deep/ .el-radio__input.is-checked .el-radio__inner {
			background: rgba(40, 40, 40, 1);
			border-color: rgba(40, 40, 40, 1);
		}
		.list-type /deep/ .el-radio__label {
			color: #999;
			font-size: 14px;
		}
		.list-type /deep/ .el-radio__input.is-checked+.el-radio__label {
			color: rgba(40, 40, 40, 1);
			font-size: 14px;
		}
	}
</style>
