package com.example.springbootstudy.di;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * packageName    : com.example.springbootstudy
 * fileName       : UrlEncoder
 * author         : tkdwk567@naver.com
 * date           : 2022/07/24
 */
public class UrlEncoder implements EncoderInterface {

    @Override
    public String encode(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
