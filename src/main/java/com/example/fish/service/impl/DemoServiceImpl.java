package com.example.fish.service.impl;

import com.example.fish.model.Demo;
import com.example.fish.repository.DemoDao;
import com.example.fish.service.DemoService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private DemoDao demoDao;

    @Override
    public List<Demo> getAll() throws Exception{
        return demoDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Demo saveDemo(Demo demo) throws Exception {
        return demoDao.saveAndFlush(demo);
    }

    @Override
    public Demo getById(String id) throws Exception {
        return demoDao.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delDemo(String id) throws Exception {
        demoDao.deleteById(id);
    }
}
