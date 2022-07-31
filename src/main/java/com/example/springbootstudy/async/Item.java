package com.example.springbootstudy.async;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.springbootstudy.async
 * fileName       : Item
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String name;
    private int price;

}
