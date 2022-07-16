/*
Template Name: 批处理系统
Version: 1.0.0
Author: zhouchaowei
date: 2022-07-05
*/
const username = $("#username").val();
const password = $("#password").val();

const LoginV2 = function () {
    "use strict";
    return {
        //main function
        init: function () {
        }
    };
}();


/**
 * 登录触发
 */
$("#login").click(function (){
    if((username !== "" && password !== "") || (username !== null && password !== null)){
        loginCheckAccount();
    }
});


/**
 * 检查用户合法性
 */
const loginCheckAccount = function() {
    const requestData = {
        "username" : $("#username").val(),
        "password" : $("#password").val()
    };
    axios.post(httpUrl + "/accountLogin/loginCheck",requestData).then(function (response){
        const result = response.data.data;
        if(result.length > 0){
            console.log(result)

        }
    }).catch(function (error){
        console.log(error);
    });
};