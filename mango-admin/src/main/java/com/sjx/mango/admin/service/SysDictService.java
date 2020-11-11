package com.sjx.mango.admin.service;

import java.util.List;

import com.sjx.mango.admin.model.SysDict;
import com.sjx.mango.core.service.CurdService;

/**
 * 字典管理
 * @author sjx
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param label
	 * @return
	 */
	List<SysDict> findBylabel(String label);
}
