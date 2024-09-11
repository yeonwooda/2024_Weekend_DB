package com.example.Springboot102.controller;


import com.example.Springboot102.model.Member;
import com.example.Springboot102.service.MemberServiece;
import com.example.Springboot102.util.ApiResponse;
import com.example.Springboot102.util.Code;
import com.example.Springboot102.util.ResponseMessage;
import com.example.Springboot102.util.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Coffee {

    private MemberServiece memberServiece;

    public Coffee(MemberServiece memberServiece) {
        this.memberServiece = memberServiece;
    }

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable Integer id) { //동적으로 바꾸는
        return this.memberServiece.getMember(id);

    }

    @GetMapping("/all-member")
    public List<Member> getAllMember() {
        return this.memberServiece.getAllMember();
    }

    @GetMapping("/api-test")
    public ApiResponse<String> getApiTest() {
        return new ApiResponse<>(Status.OK, Code.SUCCESS, ResponseMessage.SUCCESS, "점심");
    }


//    @GetMapping("/memberAll")
//    public List<Member> getMemberAll(){
//        return memberRepository.findAll();
//    }
}
