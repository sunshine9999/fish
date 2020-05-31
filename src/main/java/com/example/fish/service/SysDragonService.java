package com.example.fish.service;

import com.example.fish.model.SysDragon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SysDragonService {

    public Page<SysDragon> getAll(Pageable pageable) throws Exception;
    public SysDragon saveSysDragon(SysDragon dragon) throws Exception;
    public SysDragon getById(String id) throws Exception;
    public void delSysDragon(String id) throws Exception;

}
