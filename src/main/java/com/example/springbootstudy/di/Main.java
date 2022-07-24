package com.example.springbootstudy.di;

/**
 * packageName    : com.example.springbootstudy
 * fileName       : Main
 * author         : tkdwk567@naver.com
 * date           : 2022/07/24
 */
public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);

        Encoder encoder1 = new Encoder(new UrlEncoder());
        String result2 = encoder1.encode(url);
        System.out.println(result2);
    }
}
