package com.example.demo9.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo9.dto.MemberDto;

@SpringBootTest
public class MemberMapperTest {

    @Autowired
    MemberMapper mapper;

    @Test
    void testSelectMemberList() {
        List<MemberDto> list = mapper.selectMemberList();
        assertEquals(6, list.size());
    }
}
