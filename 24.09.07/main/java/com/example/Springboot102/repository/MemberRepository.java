package com.example.Springboot102.repository;

import com.example.Springboot102.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {



}
