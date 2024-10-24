package org.example.services;

import org.example.entity.Member;
import org.example.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member save(Member membre) {
        return memberRepository.save(membre);
    }

    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }

    public Member update(Member membre) {
        return memberRepository.save(membre);
    }
}
