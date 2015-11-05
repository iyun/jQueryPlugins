//扩展的全局方法的插件
$.extend({
    validate:function(email){
        //真实的需求开发需要正则匹配
        if(email == "leisky@outlook.com"){
            return true;
        }else{
            return false;
        }
    }
});
//局部方法的插件
$.fn.extend({
   test:function(str){
       alert(str);
   }
});
