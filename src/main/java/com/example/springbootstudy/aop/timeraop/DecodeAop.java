package com.example.springbootstudy.aop.timeraop;

import com.example.springbootstudy.aop.dto.MemberDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * packageName    : com.example.springbootstudy.aop.timeraop
 * fileName       : DecodeAop
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Aspect
@Component
public class DecodeAop {

    @Pointcut("execution(* com.example.springbootstudy.aop..*.*(..))")
    private void cut() {}

    @Pointcut("@annotation(com.example.springbootstudy.aop.timeraop.annotation.Decode)")
    private void enableDecode() {}

    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        for (Object obj : args) {
            if (obj instanceof MemberDto) {
                MemberDto memberDto = (MemberDto) obj;
                String base64Password = memberDto.getPassword();
                String password = Base64.getEncoder().encodeToString(base64Password.getBytes(StandardCharsets.UTF_8));
                memberDto.setPassword(password);
            }
        }
    }

    @AfterReturning(value = "cut() && enableDecode()", returning = "returnObj")
    public void after(JoinPoint joinPoint, Object returnObj) {
        if (returnObj instanceof MemberDto) {
            MemberDto memberDto = (MemberDto) returnObj;
            String encodePassword = memberDto.getPassword();
            String decodePassword = new String(Base64.getDecoder().decode(encodePassword), StandardCharsets.UTF_8);
            memberDto.setPassword(decodePassword);
        }
    }
}
