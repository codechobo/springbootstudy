package com.example.springbootstudy.async;

import com.example.springbootstudy.async.dto.ItemDto;
import com.example.springbootstudy.interceptor.annotation.Auth;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName    : com.example.springbootstudy.async
 * fileName       : ItemController
 * author         : tkdwk567@naver.com
 * date           : 2022/07/30
 */

@Auth
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ItemController2 {

    private final ItemRepository itemRepository;

    @PostMapping("/itmes")
    public ItemDto saveItem(@RequestBody ItemDto itemDto) {
        Item item = new Item(itemDto.getName(), itemDto.getPrice());
        itemRepository.save(item);
        return itemDto;
    }

    @GetMapping("/items")
    public Item getItem(@RequestParam String name) {
        return itemRepository.findByName(name);
    }


}
