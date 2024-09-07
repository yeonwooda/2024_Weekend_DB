package com.example.Springboot102.controller;


import com.example.Springboot102.model.Member;
import com.example.Springboot102.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class Coffee {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/member")
    @ResponseBody
    public Member getMember(){
        Optional<Member> member = memberRepository.findById(1);
        if(member.isPresent()){
            return member.get(); // 있으면 돌려줘라
        }else {
            return new Member("없음","없음","없음");
        }
    }
    @GetMapping("/memberAll")
    @ResponseBody
    public List<Member> getMemberAll(){
        return memberRepository.findAll();
    }
}
