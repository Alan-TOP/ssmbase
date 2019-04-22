package com.alan.ssmbase.service.impl;

import com.alan.ssmbase.mapper.SysUsersMapper;
import com.alan.ssmbase.model.SysUsers;
import com.alan.ssmbase.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUsersService {
    @Autowired
    private SysUsersMapper sysUsersMapper;

    public SysUsers selectByPrimaryKey(int id){
        return sysUsersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return sysUsersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUsers record) {
        return sysUsersMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUsers record) {
        return sysUsersMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUsers record) {
        return sysUsersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUsers record) {
        return 0;
    }
}
