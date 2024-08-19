package com.example.demo9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo9.dto.BookDto;
import com.example.demo9.mapper.BookMapper;

@Service
public class BookService {

    @Autowired
    BookMapper mapper;

    public List<BookDto> selectBookList() {
        return mapper.selectBookList();
    }
}