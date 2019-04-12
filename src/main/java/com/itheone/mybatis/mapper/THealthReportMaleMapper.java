package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.THealthReportMale;

import java.util.List;

public interface THealthReportMaleMapper {
	
	
	
	
    List<THealthReportMale> selectByUserId(Integer userID);
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    int insert(THealthReportMale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    int insertSelective(THealthReportMale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    THealthReportMale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(THealthReportMale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_male
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(THealthReportMale record);
}