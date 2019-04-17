package com.itheone.mybatis.service;

import com.itheone.mybatis.entity.TUser;
import com.itheone.mybatis.mapper.TUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author caohaifengx@163.com 2019-04-17 10:33
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private TUserMapper userMapper;

    @Override
    public TUser getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
