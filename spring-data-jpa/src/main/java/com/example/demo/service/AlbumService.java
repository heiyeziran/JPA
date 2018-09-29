package com.example.demo.service;

import com.example.demo.entiy.Album;

import java.util.List;

/**
 * Created by Administrator on 2018/9/29 0029.
 */
public interface AlbumService {
    List<Album> findByHotAlbum ();
    List<Album>  findAll();
}
