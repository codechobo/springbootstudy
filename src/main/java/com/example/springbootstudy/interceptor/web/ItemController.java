package com.example.springbootstudy.interceptor.web;

import com.example.springbootstudy.interceptor.annotation.Auth;
import com.example.springbootstudy.interceptor.web.dto.ItemSaveResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName    : com.example.springbootstudy.interceptor.web
 * fileName       : BController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Slf4j
@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Auth
    @GetMapping("/list")
    public ResponseEntity<List<ItemSaveResponseDto>> list() {
        ItemSaveResponseDto item1 = new ItemSaveResponseDto("다이아몬드", 1000);
        ItemSaveResponseDto item2 = new ItemSaveResponseDto("빼빼로", 1000);

        log.info("Item List 조회");
        return ResponseEntity.status(HttpStatus.OK).body(List.of(item1, item2));
    }

}
