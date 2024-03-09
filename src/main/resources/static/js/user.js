let index = {
    init:function(){
        $("#btn-save").on("click",()=>{
            this.save();
        });
    },

    save: function(){
        //alert('user의 save 함수 호출됨');
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val()
        }
        //console.log(data)
        $.ajax().done().fail();//ajax통신을 통한 3개의 파라미터 데이터를 json으로 변경하여 insert요청
    }
}

index.init();