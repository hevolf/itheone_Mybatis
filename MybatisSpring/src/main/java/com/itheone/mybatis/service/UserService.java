package com.itheone.mybatis.service;

import com.itheone.mybatis.entity.TUser;

/**
 * @author caohaifengx@163.com 2019-04-17 10:36
 */
public interface UserService {
    TUser getUserById(Integer id);
}
