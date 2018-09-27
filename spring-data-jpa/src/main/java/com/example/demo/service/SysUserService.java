package com.example.demo.service;


import com.example.demo.entiy.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser findByAccount(String account);
    List<SysUser> findUsersByNicknameLike(String keywords);
    SysUser get(Long id);
    List<SysUser> getAll();
    List<SysUser> findUsersOrderByFans(String nickname);

}
