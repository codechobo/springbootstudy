package com.example.springbootstudy.exception.controller;

import com.example.springbootstudy.exception.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * packageName    : com.example.springbootstudy.exception.controller
 * fileName       : ApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/26
 */

@Validated
@RestController
@RequestMapping("/api/v3")
public class ApiController2 {

    @GetMapping("/member")
    public MemberDto getMethod(
            @Size(min = 1)
            @RequestParam(required = false) String name,

            @NotNull
            @Min(1)
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
}