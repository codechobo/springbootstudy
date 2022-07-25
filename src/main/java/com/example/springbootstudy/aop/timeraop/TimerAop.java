package com.example.springbootstudy.aop.timeraop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * packageName    : com.example.springbootstudy.aop.timeraop
 * fileName       : TimerAop
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Aspect
@Component
public class TimerAop {

    @Pointcut("execution(* com.example.springbootstudy.aop..*.*(..))")
    private void cut() {}

    @Pointcut("@annotation(com.example.springbootstudy.aop.timeraop.annotation.Timer)")
    private void enableTimer() {}

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();

        System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
    }
}
