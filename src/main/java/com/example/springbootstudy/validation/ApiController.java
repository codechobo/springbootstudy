package com.example.springbootstudy.validation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * packageName    : com.example.springbootstudy.validation
 * fileName       : ApiController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */
@RestController
@RequestMapping("/api/v2")
public class ApiController {

    @PostMapping("/member")
    public ResponseEntity member(@Valid @RequestBody Member member,
                                 BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            result.getAllErrors().forEach(e -> {
                FieldError fieldError = (FieldError) e;
                String message = e.getDefaultMessage();

                sb.append("field : " + fieldError.getField());
                sb.append("message : " + message);
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(member);
    }
}
