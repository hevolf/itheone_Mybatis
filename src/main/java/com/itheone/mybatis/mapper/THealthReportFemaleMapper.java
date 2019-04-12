package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.THealthReportFemale;

import java.util.List;

public interface THealthReportFemaleMapper {
	
	
	List<THealthReportFemale> selectByUserId(Integer userId);
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int insert(THealthReportFemale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int insertSelective(THealthReportFemale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    THealthReportFemale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(THealthReportFemale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(THealthReportFemale record);
}