package com.example.fish.service;

import com.example.fish.model.SysFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SysFileService {

    public Page<SysFile> getAll(Pageable pageable) throws Exception;
    public SysFile saveSysFile(SysFile file) throws Exception;
    public SysFile getById(String id) throws Exception;
    public void delSysFile(String id) throws Exception;

}
