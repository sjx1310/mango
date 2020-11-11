package com.sjx.mango.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjx.mango.admin.model.SysUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

	List<SysUserRole> findUserRoles(@Param(value="userId") Long userId);

	int deleteByUserId(@Param(value="userId") Long userId);
}