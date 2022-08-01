package com.example.springbootstudy.server.web;

import com.example.springbootstudy.server.web.dto.MemberRequestDto;
import com.example.springbootstudy.server.web.dto.MemberResponseDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.example.springbootstudy.server.web
 * fileName       : ServerApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/08/01
 */

@Log4j2
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/members/{id}")
    public MemberResponseDto find(@PathVariable("id") Long id,
                                                 @RequestParam String name) {
        return MemberResponseDto.builder()
                .id(id)
                .name(name)
                .age(10)
                .email(name + "@naver.com")
                .build();
    }

    @PostMapping("/members")
    public MemberResponseDto create(
            @RequestBody MemberRequestDto memberRequestDto,
            @RequestHeader("statusCode") String hearName) {
        log.info("headr : {}", hearName);
        log.info("member : {}", memberRequestDto);

        return MemberResponseDto.builder()
                .id(memberRequestDto.getId())
                .age(memberRequestDto.getAge())
                .name(memberRequestDto.getName())
                .email(memberRequestDto.getEmail())
                .build();
    }
}
