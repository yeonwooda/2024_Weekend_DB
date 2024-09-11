package com.example.Springboot102.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Americano {


    @GetMapping("/americano")
    @ResponseBody
    public String americano(){
        return "아메리카노";
    }
}
