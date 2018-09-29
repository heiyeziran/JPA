package com.example.demo.service.impl;

import com.example.demo.dao.AlbumRepositry;
import com.example.demo.entiy.Album;
import com.example.demo.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/29 0029.
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepositry albumRepositry;
    @Override
    public List<Album> findByHotAlbum() {
        return albumRepositry.findHotAlbum();
    }

    @Override
    public List<Album> findAll() {
        return albumRepositry.findAll();
    }
}
