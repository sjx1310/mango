package com.sjx.mango.admin.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.sjx.mango.admin.model.SysConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface SysConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
    
    List<SysConfig> findPage();
    
    List<SysConfig> findPageByLabel(@Param(value="label") String label);

    List<SysConfig> findBylabel(@Param(value="label") String label);
}