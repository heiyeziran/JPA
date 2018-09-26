package com.example.demo.service.impl;

import com.example.demo.dao.StarRespository;
import com.example.demo.entiy.Star;
import com.example.demo.service.StarService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StarServiceImplTest {


    @Test
    public void findAll() throws Exception {

    }

    @Autowired
    StarRespository starRepository;


    @Test
    public void findById() throws Exception {

    }




}