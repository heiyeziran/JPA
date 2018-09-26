package com.example.demo.demo1;

import lombok.Data;

/**
 * Created by Administrator on 2018/9/17 0017.
 */
@Data
public class Card {
    private String avatar;
    private String name;
    private String time;
    private String title;
    private String pic;
    private String info;

    public Card(){

    }

    public Card(String avatar, String name, String time, String title, String pic, String info) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.pic = pic;
        this.info = info;
    }
}
