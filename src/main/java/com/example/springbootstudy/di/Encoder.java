package com.example.springbootstudy.di;

/**
 * packageName    : com.example.springbootstudy
 * fileName       : Encoder
 * author         : tkdwk567@naver.com
 * date           : 2022/07/24
 */
public class Encoder {

    private EncoderInterface encoder;

    public Encoder(EncoderInterface encoder) {
        this.encoder = encoder;
    }

    public String encode(String message) {
        return encoder.encode(message);
    }
}
