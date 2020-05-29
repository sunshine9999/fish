package com.example.fish.api;

import com.example.fish.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "sysUser", tags = "sysUser")
@RequestMapping(path = "/biz-api/fish/sysUser/v1/jpa")
public interface SysUserApi {

    @ApiOperation(value = "查询所有")
    @GetMapping("/getAll")
    List<SysUser> getAll();

    @ApiOperation(value = "查询一个")
    @GetMapping("/getById")
    SysUser getById(String id);

    @ApiOperation(value = "新增/修改")
    @PostMapping("/saveSysUser")
    SysUser saveSysUser(@RequestBody SysUser sysUser);

    @ApiOperation(value = "删除")
    @GetMapping("/delSysUser")
    void delSysUser(String id);
}
