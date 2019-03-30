package com.itheone.mybatis.demo.mapper;

import com.itheone.mybatis.demo.entity.TUserRoleKey;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(TUserRoleKey key);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);
}