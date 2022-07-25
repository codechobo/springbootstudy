package com.example.springbootstudy.jacksondatabind;

import com.example.springbootstudy.jacksondatabind.dto.Habby;
import com.example.springbootstudy.jacksondatabind.dto.MemberDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * packageName    : com.example.springbootstudy.jacksondatabind
 * fileName       : Main
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        MemberDto memberDto = MemberDto.builder()
                .name("홍길동")
                .age(10)
                .build();
        Habby habby1 = Habby.builder().name("운동").build();
        Habby habby2 = Habby.builder().name("독서").build();
        Habby habby3 = Habby.builder().name("영화").build();
        memberDto.addHabby(habby1);
        memberDto.addHabby(habby2);
        memberDto.addHabby(habby3);

        String json = objectMapper.writeValueAsString(memberDto);

        JsonNode jsonNode = objectMapper.readTree(json);
        String name = jsonNode.get("name").asText();

        ArrayNode arrayNode = (ArrayNode) jsonNode.get("habbies");
        List<Habby> habbies = objectMapper.convertValue(arrayNode, new TypeReference<List<Habby>>() {
        });

        System.out.println(habbies.toString());
    }
}
