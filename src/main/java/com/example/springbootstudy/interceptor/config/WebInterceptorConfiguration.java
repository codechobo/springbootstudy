package com.example.springbootstudy.interceptor.config;

import com.example.springbootstudy.interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName    : com.example.springbootstudy.interceptor.config
 * fileName       : WebInterceptorConfiguration
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Configuration
@RequiredArgsConstructor
public class WebInterceptorConfiguration implements WebMvcConfigurer {

    private final AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.authInterceptor);
    }
}
