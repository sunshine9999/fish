package com.example.fish.api;

import com.example.fish.model.SysFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "sysFile", tags = "sysFile")
@RequestMapping(path = "/biz-api/fish/sysFile/v1/info")
public interface SysFileApi {

    @ApiOperation(value = "查询所有")
    @GetMapping("/getAll")
    Page<SysFile> getAll(Pageable pageable);

    @ApiOperation(value = "查询一个")
    @GetMapping("/getById")
    SysFile getById(String id);

    @ApiOperation(value = "新增/修改")
    @PostMapping("/saveSysFile")
    SysFile saveSysFile(@RequestBody SysFile sysFile);

    @ApiOperation(value = "删除")
    @GetMapping("/delSysFile")
    void delSysFile(String id);
}
