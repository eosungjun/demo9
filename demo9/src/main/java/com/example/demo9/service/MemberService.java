package com.example.demo9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo9.dto.MemberDto;
import com.example.demo9.mapper.MemberMapper;

@Service
public class MemberService {
    @Autowired
    MemberMapper mapper;

    public List<MemberDto> selectMemberList() {
        return mapper.selectMemberList();
    }
}
