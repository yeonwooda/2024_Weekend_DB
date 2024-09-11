package com.example.Springboot102.controller;

import com.example.Springboot102.model.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 웹[브라우저] 프로그램 만들때 MVC(Controller) 패턴이 최적화
// URL 의사소통을 함
// Controller 

// Spring-boot : 서버와 클라이언트(Jsp, 타임리프)를 모두 만드는 (전통적인 아키텍쳐)
// 장점: 리액트 안배워도 됨  단점: 코드가 비대해짐

// React + Spring-boot : 클라이언트 / 서버(Restful Api 아키텍쳐)
// 장점 : 코드가 서로 분배됨 단점: 다 배워야함


@Controller // 웨이터
public class Coffee2 {

    @GetMapping("/test") // get 방식으로 /test url 오면 아래 함수 실행
    @ResponseBody // Json으로 돌려주는 어노테이션
    public String test(){
        return "지각";
    }

    @GetMapping("/cookie")
    @ResponseBody
    public Cookie cookie(){
        // db 조회해서 로직 필요
        return new Cookie("초코쿠키", 3500,500);
    }

    @GetMapping("/cake")
    // cake?name=이름
    // pathVariable /{1}
    public String cake(Model model, @RequestParam(name ="name") String name){
        model.addAttribute("name",name);
        return "cake.html";
    }
}
