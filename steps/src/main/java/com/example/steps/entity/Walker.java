package com.example.steps.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/10/8 0008.
 */
@Entity
@Data
public class Walker {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;

    public Walker(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public Walker() {
    }
}