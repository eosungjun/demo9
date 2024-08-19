package com.example.demo9.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo9.dto.MemberDto;

@Mapper
public interface MemberMapper {

    List<MemberDto> selectMemberList();

}
