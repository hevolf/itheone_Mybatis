package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.TUserRoleKey;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(TUserRoleKey key);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);
}