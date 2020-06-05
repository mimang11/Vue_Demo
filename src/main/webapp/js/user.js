new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },
    methods:{
        findAll:function(){
            var _this=this;
            axios.get('/VueDemo/user/findAll')
                .then(function (response) {
                    // handle success
                    console.log(response);
                    _this.userList=response.data;
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
        },
        findById:function (userid) {
            var _this=this;
            axios.get('/VueDemo/user/findById',{params:{id:userid}})
                .then(function (response) {
                    // handle success
                    console.log(response);
                    _this.user=response.data;
                    $("#myModal").modal("show")
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
        },
        update:function (user) {
            var _this=this;
            axios.post('/VueDemo/user/updateUser', _this.user)
                .then(function (response) {
                    _this.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }

    },
    created:function () {
        this.findAll();
    }
});