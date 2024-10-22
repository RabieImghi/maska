package org.example.maskacrud.service;

import org.example.maskacrud.entity.Member;
import org.example.maskacrud.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member addMember(Member member) {
        memberRepository.save(member);
        return member;
    }
}