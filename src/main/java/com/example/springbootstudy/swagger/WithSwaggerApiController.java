package com.example.springbootstudy.swagger;

import com.example.springbootstudy.exception.dto.MemberDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.example.springbootstudy.swagger
 * fileName       : WithSwaggerApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/08/01
 */

@Api(tags = "Swagger을 사용한 Controller")
@RestController
@RequestMapping("/api/v2")
public class WithSwaggerApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hell";
    }

    @GetMapping("/hello/{id}")
    public MemberDto search(
            @PathVariable("id") Long id,
            @ApiParam(name = "회원 이름", defaultValue = "")
            @RequestParam("name") String name,

            @ApiParam(name = "회원 나이", defaultValue = "1")
            @RequestParam("age") int age) {
        return MemberDto.builder()
                .name(name)
                .age(age)
                .build();
    }
}
