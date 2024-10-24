package org.example.controller;

import org.example.entity.Member;
import org.example.services.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller

public class MemberController {


    private MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("membre") Member membre) {
        memberService.save(membre);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("membre") Member membre) {
        memberService.update(membre);
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Member> list = memberService.findAll();
        model.addAttribute("list", list);
        return "listMembre";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        memberService.deleteById(id);
        return "redirect:/";
    }



}
