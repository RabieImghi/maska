package org.example;

import org.example.maskacrud.entity.Member;
import org.example.maskacrud.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//
//        Member memberSingleton = (Member) context.getBean("memberSingleton");
//        System.out.println("\n------------------------\nSingleton Member: " + memberSingleton);
//
//        Member memberSingleton2 = (Member) context.getBean("memberSingleton");
//        System.out.println("\n------------------------\nSingleton Member 2 : " + memberSingleton2);
//
//        Member memberPrototype1 = (Member) context.getBean("memberPrototype");
//        System.out.println("\n------------------------\nPrototype Member 1: " + memberPrototype1);
//
//        Member memberPrototype2 = (Member) context.getBean("memberPrototype");
//        System.out.println("\n------------------------\nPrototype Member 2: " + memberPrototype2);
//
//        System.out.println("Are Singleton instances the same? " + (memberSingleton == memberSingleton2));
//        System.out.println("\nAre prototype instances the same? " + (memberPrototype1 == memberPrototype2));
//
//
//





        MemberService memberService = context.getBean(MemberService.class);

        Member newMember = new Member("M001", "Jane", "Doe", "ID123456789", "American", LocalDate.now(), LocalDate.now().plusYears(1));
        Member newMember2 = new Member("M002", "John", "Doe", "ID987654321", "British", LocalDate.now(), LocalDate.now().plusYears(1));
        Member newMember3 = new Member("M003", "Alice", "Smith", "ID123456789", "American", LocalDate.now(), LocalDate.now().plusYears(1));
        Member newMember4 = new Member("M004", "Bob", "Smith", "ID987654321", "British", LocalDate.now(), LocalDate.now().plusYears(1));
        Member newMember5 = new Member("M005", "Charlie", "Brown", "ID123456789", "American", LocalDate.now(), LocalDate.now().plusYears(1));
        memberService.addMember(newMember);
        memberService.addMember(newMember2);
        memberService.addMember(newMember3);
        memberService.addMember(newMember4);
        memberService.addMember(newMember5);

        List<Member> members = memberService.getAllMembers();
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
