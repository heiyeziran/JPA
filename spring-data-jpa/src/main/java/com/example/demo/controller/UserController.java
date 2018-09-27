package com.example.demo.controller;

import com.example.demo.entiy.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private SysUserService sysUserService;
    @GetMapping("/all")
    public List<SysUser>getAll(){
        return sysUserService.getAll();
    }
    @GetMapping("/{id}")
    public SysUser get(@PathVariable Long id) {
        return sysUserService.get(id);
    }
    @GetMapping("/account")
    public SysUser getUserByAccount(
            @RequestParam String account) {
        return sysUserService.findByAccount(account);
    }
    @GetMapping("/nickname")
    public List<SysUser> getUsersByNicknameLike(@RequestParam String keywords) {
        return sysUserService.findUsersByNicknameLike(keywords);
    }



    @GetMapping("/order")
    public List<SysUser> getUsersOrderByFans(@RequestParam String nickname) {
        return sysUserService.findUsersOrderByFans(nickname);
    }
}

