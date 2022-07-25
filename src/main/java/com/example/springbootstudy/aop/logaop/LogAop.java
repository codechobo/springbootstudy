package com.example.springbootstudy.aop.logaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * packageName    : com.example.springbootstudy.aop.logaop
 * fileName       : LogAop
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Aspect
@Component
public class LogAop {

    @Pointcut("execution(* com.example.springbootstudy.aop..*.*(..))")
    private void cut() {}

    @Before("cut()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("method name : " + methodName);

        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);
    }

    @AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj) {
        System.out.println("return Object : " + returnObj);
    }
}
