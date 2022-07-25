package com.example.springbootstudy.aop;

import com.example.springbootstudy.aop.dto.MemberDto;
import com.example.springbootstudy.aop.timeraop.annotation.Decode;
import com.example.springbootstudy.aop.timeraop.annotation.Timer;
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

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        Thread.sleep(1000 * 2);;
    }

    @Decode
    @PutMapping("/put")
    public MemberDto put(@RequestBody MemberDto memberDto) {
        System.out.println("method name : put");
        System.out.println(memberDto);
        return memberDto;
    }
}
