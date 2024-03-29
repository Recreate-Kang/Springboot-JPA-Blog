package com.JH.Blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    //http://localhost:8000/http/http/get
    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m = new Member(1,"ssar","1234","ssar@nate.com");
        System.out.println(TAG + "getter:" + m.getId());
        m.setId(5000);
        System.out.println(TAG + "setter:" + m.getId());
        return "lombok test 완료";
    }

    private static final String TAG = "HttpControllerTest:";
    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get 요청 :"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
    }

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){
        return "post 요청 :"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
    }

    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m){
        return "put 요청"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }

}
