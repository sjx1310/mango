package com.sjx.mango.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjx.mango.admin.model.SysLog;
import org.springframework.stereotype.Repository;

/**
 * @author sjx
 */
@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value="userName") String userName);
}