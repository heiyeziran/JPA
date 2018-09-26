package com.example.demo.service.impl;

import com.example.demo.service.StudentService;
import com.example.demo.entiy.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Random;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Resource
    private StudentService studentService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void save() throws Exception {
        String[] name={"aa","bb","cc","dd","ee"};
        Random random=new Random();
        for (int i=0;i<5;i++){
            Student student =new Student();
            student.setStuName(name[i]);
            student.setStuAge(random.nextInt(30));
            System.out.println(studentService.save(student));
        }

    }

    @Test
    public void delete() throws Exception {

    }

}