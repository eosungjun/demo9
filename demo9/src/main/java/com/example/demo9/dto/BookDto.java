package com.example.demo9.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

/*
 * DTO : 데이터를 담는 그릇과 같은 역할을 하는 객체
 *          데이터를 저장하고 옮기는데 사용됨
 * 
 * 1. 필드는 private으로 작성하여 외부로부터 직접 접근을 막음
 * 2. 데이터를 세팅하기 위해서 setter, getter 메서드를 제공한다
 */
@Data
// 프레임워크로부터 자동주입 받기 위해서 사용하는 어노테이션
@Component
public class BookDto {
    private String b_no;
    private String title;
    private String author;
    private String price;
    private String p_no;
    private String rentyn;
    private String delyn;
    private String regdate;
    private String r_no;
}
