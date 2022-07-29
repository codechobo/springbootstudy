package com.example.springbootstudy.filter.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import java.io.IOException;

/**
 * packageName    : com.example.springbootstudy.filter.web.filter
 * fileName       : SecondFilter
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */
@Slf4j
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("두 번째 필터 생성");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("두 번째 필터 동작");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("두 번째 필터 종료 됩니다.");
    }
}
