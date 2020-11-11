package com.sjx.mango.admin.service;

import java.util.List;

import com.sjx.mango.admin.model.SysMenu;
import com.sjx.mango.admin.model.SysRole;
import com.sjx.mango.admin.model.SysRoleMenu;
import com.sjx.mango.core.service.CurdService;

/**
 * 角色管理
 * @author sjx
 * @date Jan 13, 2019
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
