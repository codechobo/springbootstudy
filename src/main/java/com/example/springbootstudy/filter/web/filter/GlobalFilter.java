package com.example.springbootstudy.filter.web.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * packageName    : com.example.springbootstudy.filter.controller.filter
 * fileName       : GlobalFilter
 * author         : tkdwk567@naver.com
 * date           : 2022/07/29
 */

@Slf4j
@WebFilter(urlPatterns = "/api/v1/members")
public class GlobalFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("필터 생성");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("필터 동작");
        // 전처리
        ContentCachingRequestWrapper httpRequest = new ContentCachingRequestWrapper((HttpServletRequest) request);
        ContentCachingResponseWrapper httpResponse = new ContentCachingResponseWrapper((HttpServletResponse) response);

        chain.doFilter(httpRequest, httpResponse);
        // 후처리

        String uri = httpRequest.getRequestURI();
        String requestContent = new String(httpRequest.getContentAsByteArray(), StandardCharsets.UTF_8);
        String responseContent = new String(httpResponse.getContentAsByteArray(), StandardCharsets.UTF_8);

        httpResponse.copyBodyToResponse();

        log.info("url : {}", uri);
        log.info("requestContent : {}", requestContent);
        log.info("responseContent : {}", responseContent);
    }

    @Override
    public void destroy() {
        log.info("시스템이 종료 됩니다.");
    }
}