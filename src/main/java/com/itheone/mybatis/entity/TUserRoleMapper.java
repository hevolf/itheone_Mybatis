package com.itheone.mybatis.entity;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(TUserRoleKey key);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);
}