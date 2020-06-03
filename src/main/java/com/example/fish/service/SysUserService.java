package com.example.fish.service;

import com.example.fish.model.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SysUserService {

    public Page<SysUser> getAll(Pageable pageable) throws Exception;
    public SysUser saveSysUser(SysUser user) throws Exception;
    public SysUser getById(String id) throws Exception;
    public void delSysUser(String id) throws Exception;
    public SysUser findByUserAccountAndUserPassword(String userAccount, String userPassword) throws Exception;

}
