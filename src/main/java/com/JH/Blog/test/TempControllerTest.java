package com.JH.Blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {

    @GetMapping("/temp/home")
    public String tempHome(){
        System.out.println(("temphome()"));
        return "/home.html";
    }
}
