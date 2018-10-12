package com.example.steps.repository;

import com.example.steps.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SportRepository extends JpaRepository<Sport, Integer> {

    @Query(" from Sport order by stepNumbers desc ")
    List<Sport> getAll();

    Sport findSportByAccount(String account);
}
