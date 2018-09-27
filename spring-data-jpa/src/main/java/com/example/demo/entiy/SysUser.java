package com.example.demo.entiy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Entity
@Data
public class SysUser implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String account;
    private String nickname;
    private Integer fans;
}
