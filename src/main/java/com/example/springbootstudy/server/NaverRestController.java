package com.example.springbootstudy.server;

import org.springframework.boot.rsocket.server.RSocketServer;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * packageName    : com.example.springbootstudy.server
 * fileName       : NaverRestController
 * author         : tkdwk567@naver.com
 * date           : 2022/08/01
 */
@RestController
@RequestMapping("/api/v1")
public class NaverRestController {

    // ?query=%EB%A6%AC%EB%B7%B0
    //  &display=5
    //  &start=1

    @GetMapping("/naver/search")
    public String naver(
            @RequestParam("name") String searchName,
            @RequestParam("display") String display,
            @RequestParam("start") String start) {

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/blog.json")
                .queryParam("query", searchName)
                .queryParam("display", display)
                .queryParam("start", start)
                .encode(StandardCharsets.UTF_8)
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> requestEntity = RequestEntity
                .get(uri)
                .header("X-Naver-Client-Id", "aFIzS8TStnpXzDIHhd6a")
                .header("X-Naver-Client-Secret", "yindFO8OoT")
                .build();
        ResponseEntity<String> exchange = restTemplate.exchange(requestEntity, String.class);
        return exchange.getBody();
    }
}
