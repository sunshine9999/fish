package com.example.fish.service;

import com.example.fish.model.SysRole;

import java.util.List;

public interface SysRoleService {

    public List<SysRole> getAll() throws Exception;
    public SysRole saveSysRole(SysRole role) throws Exception;
    public SysRole getById(String id) throws Exception;
    public void delSysRole(String id) throws Exception;

}
