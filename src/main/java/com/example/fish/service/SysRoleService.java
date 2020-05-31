package com.example.fish.service;

import com.example.fish.model.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SysRoleService {

    public Page<SysRole> getAll(Pageable pageable) throws Exception;
    public SysRole saveSysRole(SysRole role) throws Exception;
    public SysRole getById(String id) throws Exception;
    public void delSysRole(String id) throws Exception;

}
