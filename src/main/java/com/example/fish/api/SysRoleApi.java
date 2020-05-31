package com.example.fish.api;

import com.example.fish.model.SysRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "sysRole", tags = "sysRole")
@RequestMapping(path = "/biz-api/fish/sysRole/v1/jpa")
public interface SysRoleApi {

    @ApiOperation(value = "查询所有")
    @GetMapping("/getAll")
    Page<SysRole> getAll(Pageable pageable);

    @ApiOperation(value = "查询一个")
    @GetMapping("/getById")
    SysRole getById(String id);

    @ApiOperation(value = "新增/修改")
    @PostMapping("/saveSysRole")
    SysRole saveSysRole(@RequestBody SysRole sysRole);

    @ApiOperation(value = "删除")
    @GetMapping("/delSysRole")
    void delSysRole(String id);
}
