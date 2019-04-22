package com.alan.ssmbase.service;

import com.alan.ssmbase.model.SysUsers;

public interface SysUsersService {

    SysUsers selectByPrimaryKey(int id);

    int deleteByPrimaryKey(int id);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);

}
