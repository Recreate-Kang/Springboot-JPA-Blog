package com.JH.Blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")// WEB-INF/views/index.jsp
    public String index(){
        return "index";
    }
}
