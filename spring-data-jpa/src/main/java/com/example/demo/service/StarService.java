package com.example.demo.service;

import com.example.demo.entiy.Star;

import java.util.List;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
public interface StarService {
    List<Star>findAll();
    Star findById(Integer id);
    Star save(Star star);
}
