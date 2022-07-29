package com.example.springbootstudy.filter.web;

import com.example.springbootstudy.filter.web.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.springbootstudy.filter.controller
 * fileName       : FilterApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class MemberApiController {

    @PostMapping("/members")
    public MemberDto member(@RequestBody MemberDto memberDto) {
       log.info("DTO : {}", memberDto);
       return memberDto;
    }
}
