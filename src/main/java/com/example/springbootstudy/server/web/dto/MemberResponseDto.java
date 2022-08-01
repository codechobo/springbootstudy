package com.example.springbootstudy.server.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.springbootstudy.server.web.dto
 * fileName       : MemberResponseDto
 * author         : tkdwk567@naver.com
 * date           : 2022/08/01
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private int age;
    private String email;
}
