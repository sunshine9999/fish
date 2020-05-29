package com.example.fish.service.impl;

import com.example.fish.model.SysUser;
import com.example.fish.repository.SysUserDao;
import com.example.fish.service.SysUserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> getAll() throws Exception{
        return sysUserDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SysUser saveSysUser(SysUser user) throws Exception {
        return sysUserDao.saveAndFlush(user);
    }

    @Override
    public SysUser getById(String id) throws Exception {
        return sysUserDao.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delSysUser(String id) throws Exception {
        sysUserDao.deleteById(id);
    }
}
