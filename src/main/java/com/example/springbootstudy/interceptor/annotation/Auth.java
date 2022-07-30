package com.example.springbootstudy.interceptor.annotation;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * packageName    : com.example.springbootstudy.interceptor.annotation
 * fileName       : Auth
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Documented
@Target({TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
}
