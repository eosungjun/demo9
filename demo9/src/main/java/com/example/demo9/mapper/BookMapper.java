package com.example.demo9.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo9.dto.BookDto;

@Mapper
public interface BookMapper {

    @Select("select sysdate from dual")
    public String getTime();

    public List<BookDto> selectBookList();
}
