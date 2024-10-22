package org.example.maskacrud.service;

import org.example.maskacrud.entity.Member;
import org.example.maskacrud.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public Member addMember(Member member) {
        return memberRepository.save(member);
    }
    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }
    public Member deleteMember(String membershipNumber) {
        Member member = memberRepository.findById(membershipNumber).orElse(null);
        if (member != null) memberRepository.delete(member);
        return member;
    }
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

}