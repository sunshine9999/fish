package com.example.fish.controller;

import com.example.fish.api.SysRoleApi;
import com.example.fish.model.SysRole;
import com.example.fish.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class SysRoleController implements SysRoleApi {

    @Resource
    private SysRoleService sysRoleService;

    @Override
    public List<SysRole> getAll() {
        try {
            return sysRoleService.getAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysRole getById(String id) {
        try {
            return sysRoleService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysRole saveSysRole(SysRole sysRole) {
        try {
            return sysRoleService.saveSysRole(sysRole);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delSysRole(String id) {
        try {
            sysRoleService.delSysRole(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
