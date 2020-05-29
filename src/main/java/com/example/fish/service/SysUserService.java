package com.example.fish.service;

import com.example.fish.model.SysUser;

import java.util.List;

public interface SysUserService {

    public List<SysUser> getAll() throws Exception;
    public SysUser saveSysUser(SysUser user) throws Exception;
    public SysUser getById(String id) throws Exception;
    public void delSysUser(String id) throws Exception;

}
