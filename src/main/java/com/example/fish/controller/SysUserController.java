package com.example.fish.controller;

import com.example.fish.api.SysUserApi;
import com.example.fish.model.SysUser;
import com.example.fish.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@Slf4j
@RestController
public class SysUserController implements SysUserApi {

    @Resource
    private SysUserService sysUserService;

    @Override
    public Page<SysUser> getAll(Pageable pageable) {
        try {
            return sysUserService.getAll(pageable);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysUser getById(String id) {
        try {
            return sysUserService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysUser saveSysUser(SysUser sysUser) {
        try {
            return sysUserService.saveSysUser(sysUser);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delSysUser(String id) {
        try {
            sysUserService.delSysUser(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
