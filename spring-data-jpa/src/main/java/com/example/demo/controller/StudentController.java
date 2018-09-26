package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.entiy.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Integer id){
        return studentService.get(id);
    }
}
