package com.example.springbootstudy.aop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName    : com.example.springbootstudy.aop.dto
 * fileName       : MemberDto
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDto {

    private Long id;
    private int age;
    private String name;
    private String password;
}
