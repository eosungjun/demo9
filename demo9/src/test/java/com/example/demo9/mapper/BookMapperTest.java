package com.example.demo9.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo9.dto.BookDto;

@SpringBootTest
public class BookMapperTest {

    @Autowired
    BookMapper bookMapper;

    @Test
    void testGetTime() {
        String time = bookMapper.getTime();
        // 검증
        assertNotNull(time);
    }

    @Test
    void testSelectBookList() {
        List<BookDto> list = bookMapper.selectBookList();
        // 메서드의 실행 결과 검증
        assertEquals(128, list.size());
    }

}
