package com.example.steps.repository;

import com.example.steps.entity.Walker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalkRepository extends JpaRepository<Walker, Integer> {
    Walker findByAccountAndPassword(String account, String password);

    Walker findByAccount(String account);
}