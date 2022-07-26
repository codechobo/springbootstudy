package com.example.springbootstudy.exception.controller;

import com.example.springbootstudy.exception.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * packageName    : com.example.springbootstudy.exception.controller
 * fileName       : ApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/26
 */

@RestController
@RequestMapping("/api/v3")
public class ApiController2 {

    @GetMapping("/member")
    public MemberDto getMethod(@RequestParam(required = false) String name,
                         @RequestParam(required = false) Integer age) {
        MemberDto member = MemberDto.builder()
                .name(name)
                .age(age)
                .build();

        int a = 10 + age;

        return member;
    }

    @PostMapping("/member")
    public MemberDto create(@Valid @RequestBody MemberDto memberDto) {
        System.out.println(memberDto);
        return memberDto;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }

}