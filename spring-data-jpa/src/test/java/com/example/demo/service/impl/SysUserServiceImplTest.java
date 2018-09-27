package com.example.demo.service.impl;

import com.example.demo.entiy.SysUser;
import com.example.demo.service.SysUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Test
    public void findUsersByNicknameLike() throws Exception {

        List<SysUser> users = sysUserService.findUsersByNicknameLike("%快%");
        users.forEach(user -> System.out.println(user));
    }


    @Resource
    private SysUserService sysUserService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByAccount() {
        SysUser user = sysUserService.findByAccount("aaa@qq.com");
        System.out.println(user);
    }


    @Test
    public void get() {
        SysUser user = sysUserService.get(2l);
        System.out.println(user);
    }

    @Test
    public void getAll() {
        List<SysUser> users = sysUserService.getAll();
        users.forEach(sysUser -> System.out.println(sysUser));
    }
    @Test
    public void findUsers() {
        List<SysUser> users = sysUserService.findUsersOrderByFans("高兴");
        users.forEach(sysUser -> System.out.println(sysUser));
    }
}