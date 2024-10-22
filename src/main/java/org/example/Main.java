package org.example;

import org.example.maskacrud.entity.Member;
import org.example.maskacrud.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberService memberService = context.getBean(MemberService.class);

        // Create a new member
        Member newMember = new Member();
        newMember.setMembershipNumber("M001");
        newMember.setFirstName("John");
        newMember.setLastName("Doe");
        newMember.setIdentificationDocument("ID123456789");
        newMember.setNationality("American");
        newMember.setMembershipDate(LocalDate.now());
        newMember.setLicenseExpirationDate(LocalDate.now().plusYears(1));

        Member savedMember = memberService.addMember(newMember);
        System.out.println("Member saved successfully: " + savedMember.getMembershipNumber());
    }
}
