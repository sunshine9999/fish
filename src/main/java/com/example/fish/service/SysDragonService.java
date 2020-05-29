package com.example.fish.service;

import com.example.fish.model.SysDragon;

import java.util.List;

public interface SysDragonService {

    public List<SysDragon> getAll() throws Exception;
    public SysDragon saveSysDragon(SysDragon dragon) throws Exception;
    public SysDragon getById(String id) throws Exception;
    public void delSysDragon(String id) throws Exception;

}
