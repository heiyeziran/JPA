package com.example.demo.demo1;

import lombok.Data;

@Data
public class Topic {
    private String pic;
    private String topic;

    public Topic(){

    }

    public Topic(String pic, String topic) {
        this.pic = pic;
        this.topic = topic;
    }
}
