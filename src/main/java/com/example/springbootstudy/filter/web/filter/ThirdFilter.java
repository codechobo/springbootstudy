package com.example.springbootstudy.filter.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import java.io.IOException;

/**
 * packageName    : com.example.springbootstudy.filter.web.filter
 * fileName       : ThirdFilter
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */
@Slf4j
public class ThirdFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    }
    @Override
    public void destroy() {
    }
}
