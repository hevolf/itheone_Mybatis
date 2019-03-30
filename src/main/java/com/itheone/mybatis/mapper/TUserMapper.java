package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.TUser;

public interface TUserMapper {
	
    TUser selectByPrimaryKey(Integer id);
    
}