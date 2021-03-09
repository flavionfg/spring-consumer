package com.example.spring.consumer.dto;

public class Message {

    private String text;

    public Message() { }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
