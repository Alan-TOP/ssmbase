package com.alan.ssmbase.mapper;

import com.alan.ssmbase.model.SysUsers;

public interface SysUsersMapper {
    int deleteByPrimaryKey(int id);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    SysUsers selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);
}