package com.sjx.mango.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjx.mango.admin.model.SysDict;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
    
    List<SysDict> findPage();
    
    List<SysDict> findPageByLabel(@Param(value="label") String label);

    List<SysDict> findBylabel(@Param(value="label") String label);
}