package com.my.member.service;

import com.my.member.entity.Member;
import com.my.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
//    리포지토리를 생성자 주입방법으로 가져오기
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }


    //   리포지토리 통해서 멤버리스트 가져오기
    public List<Member> getAllList() {
        List<Member> memberList = repository.findAll();
        System.out.println(memberList);
        return memberList;
    }
}
