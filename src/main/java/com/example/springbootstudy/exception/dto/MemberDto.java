package com.example.springbootstudy.exception.dto;

import lombok.*;

import javax.validation.constraints.*;

/**
 * packageName    : com.example.springbootstudy.exception.dto
 * fileName       : MemberDto
 * author         : tkdwk567@naver.com
 * date           : 2022/07/26
 */

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    @NotEmpty
    @Size(min = 1, max = 10)
    private String name;

    @Min(1) @Max(150)
    @NotNull
    private Integer age;

}
