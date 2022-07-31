package com.example.springbootstudy.async.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.springbootstudy.async.dto
 * fileName       : ItemDto
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private String name;
    private int price;
}
