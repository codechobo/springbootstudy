package com.example.springbootstudy.validation;

import com.example.springbootstudy.validation.annotation.YearMonth;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.*;

/**
 * packageName    : com.example.springbootstudy.validation
 * fileName       : Member
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @NotEmpty
    private String name;

    @Min(value = 0)
    @Max(value = 150)
    private int age;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(max = 11)
    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("req_year_month")
    @YearMonth
    private String reqYearMonth; // yyyy/mm/dd

}
