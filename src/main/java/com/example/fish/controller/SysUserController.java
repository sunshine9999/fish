package com.example.fish.controller;

import com.example.fish.api.DemoApi;
import com.example.fish.model.Demo;
import com.example.fish.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class SysUserController implements DemoApi {

    @Resource
    private DemoService demoService;

    @Override
    public List<Demo> getAll() {
        try {
            return demoService.getAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Demo getById(String id) {
        try {
            return demoService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Demo saveDemo(Demo demo) {
        try {
            return demoService.saveDemo(demo);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delDemo(String id) {
        try {
            demoService.delDemo(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
