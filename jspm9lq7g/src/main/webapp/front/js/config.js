
var projectName = '高校四六级报名管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '四六级报名',
	url: './pages/siliujibaoming/list.jsp'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm9lq7g/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"四六级报名","menuJump":"列表","tableName":"siliujibaoming"}],"menu":"四六级报名管理"},{"child":[{"buttons":["查看","修改","删除","审核","分配准考号"],"menu":"报名记录","menuJump":"列表","tableName":"baomingjilu"}],"menu":"报名记录管理"},{"child":[{"buttons":["查看","修改","删除","导出"],"menu":"准考记录","menuJump":"列表","tableName":"zhunkaojilu"}],"menu":"准考记录管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"身份证认证","menuJump":"列表","tableName":"shenfenzhengrenzheng"}],"menu":"身份证认证管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"考试资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服咨询","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"四六级报名列表","menuJump":"列表","tableName":"siliujibaoming"}],"menu":"四六级报名模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"报名记录","menuJump":"列表","tableName":"baomingjilu"}],"menu":"报名记录管理"},{"child":[{"buttons":["查看","导出"],"menu":"准考记录","menuJump":"列表","tableName":"zhunkaojilu"}],"menu":"准考记录管理"},{"child":[{"buttons":["查看","新增","修改"],"menu":"身份证认证","menuJump":"列表","tableName":"shenfenzhengrenzheng"}],"menu":"身份证认证管理"}],"frontMenu":[{"child":[{"buttons":["查看","报名"],"menu":"四六级报名列表","menuJump":"列表","tableName":"siliujibaoming"}],"menu":"四六级报名模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
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
