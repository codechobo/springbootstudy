package com.example.springbootstudy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * packageName    : com.example.springbootstudy.exception
 * fileName       : GlobalControllerAdvice
 * author         : tkdwk567@naver.com
 * date           : 2022/07/26
 */

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exception(Exception e) {
        System.out.println("----------------------");
        System.out.println(e.getLocalizedMessage());
        System.out.println(e.getClass().getName());
        System.out.println("----------------------");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }
}
