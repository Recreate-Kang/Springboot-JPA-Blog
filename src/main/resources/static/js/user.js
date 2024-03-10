let index = {
    init:function(){
        $("#btn-save").on("click",()=>{ //function(){} 대신 ()=>{} 는 this를 바인딩 하기 위함
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

        //ajax호출시 dafault 가 비동기 호출
        //ajax 통신을 이용하여 3개의 데이터를 json으로 변경하여 insert 요청!
        $.ajax({
            type: "POST",
            url: "/auth/joinProc",
            data: JSON.stringify(data), //http body데이터
            contentType:"application/json; charset=utf-8",//body데이터가 어떤 타입인지(MIME)
            dataType: "json"//요청을 서버로 해서 응답이 왔을 때 기본적으로 모든것이 string으로 오지만 생긴게 json => javascript 오브젝트로 변경
        }).done(function(response){
            alert("회원가입이 완료되었습니다.");
            console.log(response)
            location.href="/"
        }).fail(function(error){
            alert(JSON.stringify(error));
        });//ajax통신을 통한 3개의 파라미터 데이터를 json으로 변경하여 insert요청
    }
}

index.init();