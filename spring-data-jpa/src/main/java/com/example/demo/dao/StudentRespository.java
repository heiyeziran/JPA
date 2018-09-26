package com.example.demo.dao;

import com.example.demo.entiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/9/20 0020.
 */
public interface StudentRespository extends JpaRepository<Student,Integer> {

}
