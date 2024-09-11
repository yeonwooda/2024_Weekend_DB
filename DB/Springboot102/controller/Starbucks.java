package com.example.Springboot102.controller;

import com.example.Springboot102.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starbucks {

    @GetMapping("/menu")

    public String menu(){
        return "메뉴판입니다";
    }


}
