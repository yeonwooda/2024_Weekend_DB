package com.example.Springboot102.controller;

import com.example.Springboot102.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Starbucks {

    @GetMapping("/menu")
    @ResponseBody
    public String menu(){
        return "메뉴판입니다";
    }

    @GetMapping("/coffee")
    public String coffee(){
        return "coffee.html";
    }


}
