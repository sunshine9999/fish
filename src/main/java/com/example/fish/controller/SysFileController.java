package com.example.fish.controller;

import com.example.fish.api.SysFileApi;
import com.example.fish.model.SysFile;
import com.example.fish.service.SysFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@Slf4j
@RestController
public class SysFileController implements SysFileApi {

    @Resource
    private SysFileService sysFileService;

    @Override
    public Page<SysFile> getAll(Pageable pageable) {
        try {
            return sysFileService.getAll(pageable);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysFile getById(String id) {
        try {
            return sysFileService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SysFile saveSysFile(SysFile sysFile) {
        try {
            return sysFileService.saveSysFile(sysFile);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delSysFile(String id) {
        try {
            sysFileService.delSysFile(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
