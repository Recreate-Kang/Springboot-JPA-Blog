package com.JH.Blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//인증 안된 사용자 경로 /auth/**허용
//그냥 주소가 / 이면 index.jsp허용
//static이하의 /js/**,/css/**,/image/** 허용
@Controller
public class UserController {

    @GetMapping("/auth/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    @GetMapping("/auth/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }
}
