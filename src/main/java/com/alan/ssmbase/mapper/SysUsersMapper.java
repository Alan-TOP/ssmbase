package com.alan.ssmbase.mapper;

import com.alan.ssmbase.model.SysUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    SysUsers selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);
}