package com.example.demo9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo9.dto.MemberDto;
import com.example.demo9.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/member/")
@Slf4j
public class MemberController {

    @Autowired
    MemberService service;

    @GetMapping("/memberDetail")
    public String getMethodName(MemberDto member, Model model) {
        // 수집된 파라메터 출력
        log.info("m_no : " + member.getM_no());
        if (member.getM_no() == null) {
            // 메세지를 출력하고 뒤로가기하는 페이지를 호출
            model.addAttribute("msg", "사용자 번호(필수)가 입력되지 않았습니다.");
            return "common/msg";
        }

        return "member/memberDetail";

    }

    @GetMapping("/memberList")
    public void getMethodName(Model model) {
        List<MemberDto> list = service.selectMemberList();
        model.addAttribute("memberList", list);
    }

}
