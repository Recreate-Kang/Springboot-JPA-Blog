package com.JH.Blog.Controller.api;

import com.JH.Blog.dto.ResponseDto;
import com.JH.Blog.model.RoleType;
import com.JH.Blog.model.User;
import com.JH.Blog.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder encode;

    @PostMapping("/auth/joinProc")
    public ResponseDto<Integer> save(@RequestBody User user){//username,password,email
        System.out.println(("Usercontroller: save 호출됨"));
        user.setRole(RoleType.USER);
        userService.회원가입(user);
        //실제로 D
        // B에 insert후 return 함
        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }
}
