package com.example.springbootstudy.di;

import java.util.Base64;

/**
 * packageName    : com.example.springbootstudy
 * fileName       : Base64Encoder
 * author         : tkdwk567@naver.com
 * date           : 2022/07/24
 */
public class Base64Encoder implements EncoderInterface {

    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
