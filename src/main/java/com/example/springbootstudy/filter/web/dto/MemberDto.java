package com.example.springbootstudy.filter.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.springbootstudy.filter.controller.dto
 * fileName       : MemberDto
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String name;
    private int age;

}
