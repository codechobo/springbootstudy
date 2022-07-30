package com.example.springbootstudy.interceptor.web.dto;

import com.example.springbootstudy.interceptor.annotation.Auth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.springbootstudy.interceptor.web.dto
 * fileName       : Item
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSaveResponseDto {

    private String name;
    private int price;
}
