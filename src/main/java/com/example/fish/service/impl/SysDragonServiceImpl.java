package com.example.fish.service.impl;

import com.example.fish.model.SysDragon;
import com.example.fish.repository.SysDragonDao;
import com.example.fish.service.SysDragonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
public class SysDragonServiceImpl implements SysDragonService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private SysDragonDao sysDragonDao;

    @Override
    public Page<SysDragon> getAll(Pageable pageable) throws Exception{
        return sysDragonDao.findAll(pageable);
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
