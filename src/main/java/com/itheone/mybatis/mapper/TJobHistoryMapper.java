package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.TJobHistory;

import java.util.List;

public interface TJobHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobHistory record);

    int insertSelective(TJobHistory record);

    TJobHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobHistory record);

    int updateByPrimaryKey(TJobHistory record);
    
    List<TJobHistory> selectByUserId(int userId);
}