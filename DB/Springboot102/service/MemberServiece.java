package com.example.Springboot102.service;

import com.example.Springboot102.constants.Message;
import com.example.Springboot102.model.Member;
import com.example.Springboot102.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiece {

    private MemberRepository memberRepository;

    public MemberServiece(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMember(Integer id){
        Optional<Member> member = memberRepository.findById(id);
        if(member.isPresent()){
            return member.get(); // 있으면 돌려줘라
        }else {
            return new Member("없음","없음","없음");
        }
    }


    public String getNameById(Integer id){
        return this.memberRepository.findById(id).map((v) -> v.getName()).orElse(Message.INVALID_MEMBER_ID.getMessage());
    }

    public List<Member> getAllMember(){
        return this.memberRepository.findAll();
    }
}
