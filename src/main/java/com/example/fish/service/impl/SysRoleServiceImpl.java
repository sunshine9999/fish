package com.example.fish.service.impl;

import com.example.fish.model.SysRole;
import com.example.fish.repository.SysRoleDao;
import com.example.fish.service.SysRoleService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private SysRoleDao rsysRoleDao;

    @Override
    public List<SysRole> getAll() throws Exception{
        return rsysRoleDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SysRole saveSysRole(SysRole role) throws Exception {
        return rsysRoleDao.saveAndFlush(role);
    }

    @Override
    public SysRole getById(String id) throws Exception {
        return rsysRoleDao.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delSysRole(String id) throws Exception {
        rsysRoleDao.deleteById(id);
    }
}
