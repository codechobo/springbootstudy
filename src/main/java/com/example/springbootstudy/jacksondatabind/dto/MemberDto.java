package com.example.springbootstudy.jacksondatabind.dto;

import lombok.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.example.springbootstudy.jacksondatabind
 * fileName       : Member
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String name;
    private int age;
    private List<Habby> habbies = new ArrayList<>();

    @Builder
    public MemberDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addHabby(Habby habby) {
        if (habby == null) {
            throw new IllegalArgumentException("habby is null!!");
        } else {
            this.habbies.add(habby);
        }
    }
}
