package com.sjx.mango.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.sjx.mango.admin.model.SysUser;
import com.sjx.mango.admin.model.SysUserRole;
import com.sjx.mango.core.page.PageRequest;
import com.sjx.mango.core.service.CurdService;

/**
 * 用户管理
 * @author sjx
 * @date Jan 13, 2019
 */
public interface SysUserService extends CurdService<SysUser> {
	/**
	 * 查找用户的菜单权限标识集合
	 * @param username name
	 * @return user
	 */
	SysUser findByName(String username);


	/**
	 * 查找用户的角色集合
	 * @param userName name
	 * @return permissions
	 */
	Set<String> findPermissions(String userName);

	/**
	 * @param userId id
	 * @return roles
	 */
	List<SysUserRole> findUserRoles(Long userId);



}
