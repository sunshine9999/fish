package com.example.fish.api;

import com.example.fish.model.Demo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "demo", tags = "demo")
@RequestMapping(path = "/biz-api/fish/demo/v1/jpa")
public interface DemoApi{

    @ApiOperation(value = "查询所有")
    @GetMapping("/getAll")
    List<Demo> getAll();

    @ApiOperation(value = "查询一个")
    @GetMapping("/getById")
    Demo getById(String id);

    @ApiOperation(value = "新增/修改")
    @PostMapping("/saveDemo")
    Demo saveDemo(@RequestBody Demo demo);

    @ApiOperation(value = "删除")
    @GetMapping("/delDemo")
    void delDemo(String id);
}
