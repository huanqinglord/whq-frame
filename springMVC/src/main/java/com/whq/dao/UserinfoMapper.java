package com.whq.dao;

import com.whq.entity.Userinfo;
import com.whq.entity.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int deleteByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    Userinfo selectByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Mon Apr 22 19:34:18 CST 2019
     */
    int updateByPrimaryKey(Userinfo record);
}