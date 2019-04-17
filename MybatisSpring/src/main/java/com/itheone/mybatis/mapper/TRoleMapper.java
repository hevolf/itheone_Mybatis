package com.itheone.mybatis.mapper;

import com.itheone.mybatis.entity.TRole;
import com.itheone.mybatis.entity.TRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    long countByExample(TRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int deleteByExample(TRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int insert(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int insertSelective(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    List<TRole> selectByExample(TRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    TRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TRole record);
}