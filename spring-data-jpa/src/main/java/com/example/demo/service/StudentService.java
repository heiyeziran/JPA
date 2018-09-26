package com.example.demo.service;

import com.example.demo.entiy.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
public interface StudentService {
    Student get(int id);
    List<Student> getAll();
    Student save(Student student);
    void delete(int id);
}
