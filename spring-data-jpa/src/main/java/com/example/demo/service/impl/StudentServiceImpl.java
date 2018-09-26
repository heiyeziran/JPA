package com.example.demo.service.impl;

import com.example.demo.service.StudentService;
import com.example.demo.dao.StudentRespository;
import com.example.demo.entiy.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRespository studentRespository;
    @Override
    public Student get(int id) {
        return studentRespository.getOne(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRespository.findAll();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void delete(int id) {
    }


}
