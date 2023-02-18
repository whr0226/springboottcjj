const base = {
    get() {
        return {
            url : "http://localhost:8080/springboottcjj/",
            name: "springboottcjj",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboottcjj/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot的同城家教系统的设计与实现."
        } 
    }
}
export default base
