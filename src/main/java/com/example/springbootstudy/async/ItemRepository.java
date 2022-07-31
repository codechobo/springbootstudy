package com.example.springbootstudy.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : com.example.springbootstudy.async
 * fileName       : ItemRepository
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Slf4j
@Repository
public class ItemRepository {

    private List<Item> items = new ArrayList<>();

    @Async
    public void save(Item entity) {
        log.info("add()");

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.items.add(entity);
    }

    public void delete(Item entity) {
        findByName(entity.getName());
    }

    public Item findByName(String name) {
        return this.items.stream()
                .filter(i -> i.getName().equals(name))
                .findAny().orElseThrow();
    }
}
