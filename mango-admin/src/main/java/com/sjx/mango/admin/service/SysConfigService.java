package com.sjx.mango.admin.service;

import java.util.List;

import com.sjx.mango.admin.model.SysConfig;
import com.sjx.mango.core.service.CurdService;

/**
 * 系统配置管理
 * @author sjx
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param label
	 * @return
	 */
	List<SysConfig> findByLabel(String label);
}
