package com.alan.ssmbase.service.impl;

import com.alan.ssmbase.mapper.SysUsersMapper;
import com.alan.ssmbase.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUsersService {
    @Autowired
    private SysUsersMapper sysUsersMapper;

    public String get(int id){
        return sysUsersMapper.selectByPrimaryKey(id).toString();
    }
}
