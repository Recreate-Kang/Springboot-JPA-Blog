package com.JH.Blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//스프링이 com.cos.blog 이하를 스캔해서 어노테이션을 검사하여 특정 클래스들을 new해서 스프링 컨테이너에 관리함
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";

    }

}
