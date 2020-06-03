package com.example.fish.repository;

import com.example.fish.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao extends JpaRepository<SysUser,String> {

    public SysUser findByUserAccountAndUserPassword(String userAccount, String userPassword);

}
