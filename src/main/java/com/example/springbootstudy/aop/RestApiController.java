package com.example.springbootstudy.aop;

import com.example.springbootstudy.aop.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.example.springbootstudy.aop
 * fileName       : RestApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(
            @PathVariable("id") Long id,
            @RequestParam String name) {
        return String.format("id : " + id + " name : " + name);
    }

    @PostMapping("/post")
    public MemberDto post(@RequestBody MemberDto memberDto) {
        return memberDto;
    }
}
