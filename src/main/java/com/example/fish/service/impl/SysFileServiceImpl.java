package com.example.fish.service.impl;

import com.example.fish.model.SysFile;
import com.example.fish.repository.SysFileDao;
import com.example.fish.service.SysFileService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
public class SysFileServiceImpl implements SysFileService {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private SysFileDao sysFileDao;

    @Override
    public Page<SysFile> getAll(Pageable pageable) throws Exception{
        return sysFileDao.findAll(pageable);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SysFile saveSysFile(SysFile file) throws Exception {
        return sysFileDao.saveAndFlush(file);
    }

    @Override
    public SysFile getById(String id) throws Exception {
        return sysFileDao.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delSysFile(String id) throws Exception {
        sysFileDao.deleteById(id);
    }
}
