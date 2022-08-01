package com.example.springbootstudy.server.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.example.springbootstudy.server.web.dto
 * fileName       : MemberRequestDto
 * author         : tkdwk567@naver.com
 * date           : 2022/08/01
 */

@Getter
@Builder
@AllArgsConstructor
public class MemberRequestDto {

    private Long id;
    private String name;
    private int age;
    private String email;

}
