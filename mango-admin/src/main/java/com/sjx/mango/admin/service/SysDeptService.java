package com.sjx.mango.admin.service;

import java.util.List;

import com.sjx.mango.admin.model.SysDept;
import com.sjx.mango.core.service.CurdService;

/**
 * 机构管理
 * @author sjx
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return list
	 */
	List<SysDept> findTree();
}
