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
public class Sport {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private Integer stepNumbers;

    public Sport(String account, Integer stepNumbers) {
        this.account = account;
        this.stepNumbers = stepNumbers;
    }

    public Sport() {
    }
}