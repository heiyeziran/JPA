package com.example.demo.entiy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@Entity
@Data
public class Star {
    @Id
    @GeneratedValue
    private Integer id;
    private String starName;
    private String starInfo;
    private String starSex;
    private String starWorks;
    private String starImage;

}
