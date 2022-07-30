package com.example.springbootstudy.interceptor.interceptor;

import com.example.springbootstudy.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.invoke.MethodHandle;

/**
 * packageName    : com.example.springbootstudy.interceptor.interceptor
 * fileName       : AuthInterceptor
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("핸들러 호출 하기 전 @@@");

        if (hasAnnotation(handler)) {
            // 로직 ..

            return true;
        }

        return false;
    }

    private boolean hasAnnotation(Object handler) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        if (handlerMethod.getClass().getAnnotation(Auth.class) != null ||
                handlerMethod.getBeanType().getAnnotation(Auth.class) != null) {
            return true;
        }
        return false;
    }

}
