package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsMember;
import com.dzmsoft.sms.base.pojo.SmsMemberExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsMemberMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int countByExample(SmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int deleteByExample(SmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int insert(SmsMember record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int insertSelective(SmsMember record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    List<SmsMember> selectByExample(SmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    SmsMember selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsMember record,
            @Param("example") SmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int updateByExample(@Param("record") SmsMember record,
            @Param("example") SmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int updateByPrimaryKeySelective(SmsMember record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_member
     * @mbggenerated  Sat Jul 23 16:05:51 CST 2016
     */
    int updateByPrimaryKey(SmsMember record);

    public PageList<SmsMember> selectByExample(SmsMemberExample example,PageBounds pageBounds);
}