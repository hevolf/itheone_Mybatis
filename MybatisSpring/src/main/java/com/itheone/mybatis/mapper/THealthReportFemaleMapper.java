package com.itheone.mybatis.mapper;


import java.util.List;

import com.itheone.mybatis.entity.THealthReportFemale;
import com.itheone.mybatis.entity.THealthReportFemaleExample;
import org.apache.ibatis.annotations.Param;

public interface THealthReportFemaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    long countByExample(THealthReportFemaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int deleteByExample(THealthReportFemaleExample example);

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
    List<THealthReportFemale> selectByExample(THealthReportFemaleExample example);

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
    int updateByExampleSelective(@Param("record") THealthReportFemale record, @Param("example") THealthReportFemaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_health_report_female
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") THealthReportFemale record, @Param("example") THealthReportFemaleExample example);

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