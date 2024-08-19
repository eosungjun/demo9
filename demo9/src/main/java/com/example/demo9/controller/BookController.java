package com.example.demo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo9.dto.BookDto;
import com.example.demo9.service.BookService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BookController {
    @GetMapping("/msg")
    public void getMethodName(@RequestParam(required = false, name = "msg") String msg, Model model) {
        model.addAttribute("msg", msg);
    }

    @GetMapping("/book/rent")
    public String getMethodName() {
        return "book/bookList";
    }

    @GetMapping("/book/bookWrite")
    public void bookWrite() {
    }

    @GetMapping("/book/bookDetail")
    public void bookDetail() {
        // 1권의 도서의 정보를 상세 조회

        // 도서 상세보기로 연결하지 않는 경우
        // 1. 만약 도서번호가 입력되지 않았다면 도서의 정보를 조회 할 수 없다
        // 2. 또는 잘못된 번호를 입력 한 경우
        // 메세지처리(alert('메세지'))를 하고 이전페이지(history.back(1))로 이동

    }

    @Autowired
    BookService service;

    // index.html 파일을 생성해 놓아도 컨트롤러가 우선 되어 출력
    @GetMapping("/")
    public String getMethodName(
            // 파라메터의 자동 수집
            // RequestParam 어노테이션
            // 1. 이름속성설정
            // 2. 필수값 처리
            @RequestParam(required = false, name = "param") String param
            // DTO객체에 파라메터를 자동 수집
            , BookDto book
            // 사용자의 요청을 수집 하는 객체
            // - 사용자의 요청정보를 담은 객체로
            , HttpServletRequest request, Model model) {

        // 수집된 파라메터 출력
        log.info(param);
        System.out.println(param);

        // 화면에 전달할 파라메터를 model 에 추가
        model.addAttribute("list", service.selectBookList());

        /*
         * // request객체로 부터 파라메터를 수집 하는 방법
         * // - Spring에서 제공해주는 컨트롤러를 이용하면 파라메터가 자동 수집 된다
         * log.info("request객체로부터 파라메터 수집 : "
         * + request.getParameter("param"));
         * BookDto bookDto = new BookDto();
         * bookDto.setB_no(request.getParameter("B_no"));
         * log.info(book.getB_no());
         */
        return "book/bookList";
    }

}
