package com.example.fish.controller;

import com.example.fish.api.SysDragonApi;
import com.example.fish.model.SysDragon;
import com.example.fish.service.SysDragonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class SysDragonController implements SysDragonApi {

    @Resource
    private SysDragonService sysDragonService;

    @Override
    public List<SysDragon> getAll() {
        try {
            return sysDragonService.getAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysDragon getById(String id) {
        try {
            return sysDragonService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysDragon saveSysDragon(SysDragon sysDragon) {
        try {
            return sysDragonService.saveSysDragon(sysDragon);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delSysDragon(String id) {
        try {
            sysDragonService.delSysDragon(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
