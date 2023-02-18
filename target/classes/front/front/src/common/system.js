export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"家教老师","menuJump":"列表","tableName":"jiajiaolaoshi"}],"menu":"家教老师管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论"],"menu":"家教招聘","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","审核"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"课程类别","menuJump":"列表","tableName":"kechengleibie"}],"menu":"课程类别管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","教师业绩"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","满意度统计"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"网站公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","支付","评价"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"应聘信息","menuJump":"列表","tableName":"yingpinxinxi"}],"menu":"应聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论","修改"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","审核","教师业绩"],"menu":"课程订单","menuJump":"列表","tableName":"kechengdingdan"}],"menu":"课程订单管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","满意度统计"],"menu":"家教评价","menuJump":"列表","tableName":"jiajiaopingjia"}],"menu":"家教评价管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论","立即应聘"],"menu":"家教招聘列表","menuJump":"列表","tableName":"jiajiaozhaopin"}],"menu":"家教招聘模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","查看评论","预约课程","立即预约"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家教老师","tableName":"jiajiaolaoshi"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
