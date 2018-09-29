package com.example.demo.controller;

import com.example.demo.entiy.Album;
import com.example.demo.service.AlbumService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/29 0029.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;
    @GetMapping(value = "/all")
    public List<Album> findAll(){
        return albumService.findAll();
    }
    @GetMapping(value = "/order")
    public List<Album> findHotAlbum(){
        return albumService.findByHotAlbum();
    }
}
