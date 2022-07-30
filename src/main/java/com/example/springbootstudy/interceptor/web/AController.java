package com.example.springbootstudy.interceptor.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.springbootstudy.interceptor.web
 * fileName       : AController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Slf4j
@RestController
@RequestMapping("/api")
public class AController {

    @GetMapping("/hello")
    public String createA() {
        log.info("createA() 호출");
        return "HELLO";
    }
}
