package com.JH.Blog.test;

import com.JH.Blog.model.RoleType;
import com.JH.Blog.repository.UserRepository;
import com.JH.Blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println(("id:"+user.getRole()));
        System.out.println("username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());
        System.out.println("email:"+user.getEmail());
        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }
}
