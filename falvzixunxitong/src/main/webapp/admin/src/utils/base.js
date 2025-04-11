const base = {
    get() {
        return {
            url : "http://localhost:8080/falvzixunxitong/",
            name: "falvzixunxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/falvzixunxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "法律咨询系统"
        } 
    }
}
export default base
