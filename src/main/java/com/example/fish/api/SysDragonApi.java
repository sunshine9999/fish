package com.example.fish.api;

import com.example.fish.model.SysDragon;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "sysDragon", tags = "sysDragon")
@RequestMapping(path = "/biz-api/fish/sysDragon/v1/info")
public interface SysDragonApi {

    @ApiOperation(value = "查询所有")
    @GetMapping("/getAll")
    Page<SysDragon> getAll(Pageable pageable);

    @ApiOperation(value = "查询一个")
    @GetMapping("/getById")
    SysDragon getById(String id);

    @ApiOperation(value = "新增/修改")
    @PostMapping("/saveDragon")
    SysDragon saveSysDragon(@RequestBody SysDragon sysDragon);

    @ApiOperation(value = "删除")
    @GetMapping("/delDragon")
    void delSysDragon(String id);
}
