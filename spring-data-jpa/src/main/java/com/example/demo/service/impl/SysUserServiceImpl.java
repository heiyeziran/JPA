package com.example.demo.service.impl;


import com.example.demo.dao.SysUserRespository;
import com.example.demo.entiy.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRespository sysUserRespository;

    @Override
    public SysUser findByAccount(String account) {
        return sysUserRespository.findByAccount(account);
    }

    @Override
    public List<SysUser> findUsersByNicknameLike(String keywords) {
        return sysUserRespository.findByNicknameLike(keywords);
    }

    @Override
    public SysUser get(Long id) {
        return sysUserRespository.findById(id).get();
    }

    @Override
    public List<SysUser> getAll() {
        return sysUserRespository.findAll();
    }

    @Override
    public List<SysUser> findUsersOrderByFans(String nickname) {
        return sysUserRespository.findByNicknameLike(nickname);
    }


}
