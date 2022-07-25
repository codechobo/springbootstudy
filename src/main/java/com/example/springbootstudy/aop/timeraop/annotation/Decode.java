package com.example.springbootstudy.aop.timeraop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * packageName    : com.example.springbootstudy.aop.timeraop.annotation
 * fileName       : Decode
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Decode {
}
