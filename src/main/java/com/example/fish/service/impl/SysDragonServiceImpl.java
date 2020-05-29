package com.example.fish.service.impl;

import com.example.fish.model.SysDragon;
import com.example.fish.repository.SysDragonDao;
import com.example.fish.service.SysDragonService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysDragonServiceImpl implements SysDragonService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private SysDragonDao sysDragonDao;

    @Override
    public List<SysDragon> getAll() throws Exception{
        return sysDragonDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SysDragon saveSysDragon(SysDragon dragon) throws Exception {
        return sysDragonDao.saveAndFlush(dragon);
    }

    @Override
    public SysDragon getById(String id) throws Exception {
        return sysDragonDao.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delSysDragon(String id) throws Exception {
        sysDragonDao.deleteById(id);
    }
}
