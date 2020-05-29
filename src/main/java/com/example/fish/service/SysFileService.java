package com.example.fish.service;

import com.example.fish.model.SysFile;

import java.util.List;

public interface SysFileService {

    public List<SysFile> getAll() throws Exception;
    public SysFile saveSysFile(SysFile file) throws Exception;
    public SysFile getById(String id) throws Exception;
    public void delSysFile(String id) throws Exception;

}
