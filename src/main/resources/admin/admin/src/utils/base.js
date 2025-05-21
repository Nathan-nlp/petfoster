const base = {
    get() {
        return {
            url : "http://localhost:8080/petfoster/",
            name: "petfoster",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/petfoster/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Web的宠物寄养平台"
        } 
    }
}
export default base
