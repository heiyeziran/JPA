package com.example.demo.dao;

import com.example.demo.entiy.Album;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/9/29 0029.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositryTest {
    @Resource
    private AlbumRepositry albumRepository;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findHotAlbum() throws Exception {
        List<Album> albumList=albumRepository.findHotAlbum();
        albumList.forEach(album -> System.out.println(album));
    }
    @Test
    public void initData(){
        Album[] albums={
                new Album("https://i01piccdn.sogoucdn.com/b70b3af23fefefb5","手绘","晚安相册",3200),
                new Album("https://i03piccdn.sogoucdn.com/aea065fe2fdd1088","创意","卡通",1230),
                new Album("https://i03piccdn.sogoucdn.com/84d5672a58e74808","唯美","风景唯美图",1012),
                new Album("https://i02piccdn.sogoucdn.com/192d7f7545945ee8","天空","日升的美丽",2100),
                new Album("https://i02piccdn.sogoucdn.com/aee7a6e11fa6b866","夜晚","夜晚烟火",3025),
                new Album("https://img03.sogoucdn.com/app/a/100520093/60d2f4fe0275d790-007c9f9485c5acfd-bdc6566f9acf5ba2a7e7190734c38920.jpg","动漫","热血动漫",1243)
        };
        for (int i=0;i<6;i++){
            albumRepository.save(albums[i]);
        }
    }

}