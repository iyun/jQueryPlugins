//��չ��ȫ�ַ����Ĳ��
$.extend({
    validate:function(email){
        //��ʵ�����󿪷���Ҫ����ƥ��
        if(email == "leisky@outlook.com"){
            return true;
        }else{
            return false;
        }
    }
});
//�ֲ������Ĳ��
$.fn.extend({
   test:function(str){
       alert(str);
   }
});
