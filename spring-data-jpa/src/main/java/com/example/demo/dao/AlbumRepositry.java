package com.example.demo.dao;


import com.example.demo.entiy.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlbumRepositry extends JpaRepository<Album,Integer> {
    @Query("from Album a  order by a.likes desc ")
    List<Album> findHotAlbum();
}
