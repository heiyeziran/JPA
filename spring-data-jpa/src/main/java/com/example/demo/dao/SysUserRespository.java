package com.example.demo.dao;


import com.example.demo.entiy.SysUser;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysUserRespository extends JpaRepository<SysUser,Long> {
    SysUser findByAccount(String account);
    List<SysUser> findByNicknameLike(String keywords);
    @Query("from SysUser u where u.nickname  like CONCAT('%',:nickname,'%') order by  u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);

}
