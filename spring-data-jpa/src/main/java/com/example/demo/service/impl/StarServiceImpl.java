package com.example.demo.service.impl;

import com.example.demo.dao.StarRespository;
import com.example.demo.entiy.Star;
import com.example.demo.service.StarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@Service
public class StarServiceImpl implements StarService {
    @Resource
    private StarRespository starRespository;

    @Override
    public List<Star> findAll() {
        return starRespository.findAll();
    }

    @Override
    public Star findById(Integer id) {
        return starRespository.findById(id).get();
    }

    @Override
    public Star save(Star star) {
        return starRespository.save(star);
    }

}
