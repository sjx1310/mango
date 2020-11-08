package com.sjx.mango.admin.bean;

import java.io.Serializable;
import java.util.Date;

public class RoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.role_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.menu_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.create_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.create_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.last_update_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_menu.last_update_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.id
     *
     * @return the value of sys_role_menu.id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.id
     *
     * @param id the value for sys_role_menu.id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.role_id
     *
     * @return the value of sys_role_menu.role_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.role_id
     *
     * @param roleId the value for sys_role_menu.role_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.menu_id
     *
     * @return the value of sys_role_menu.menu_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.menu_id
     *
     * @param menuId the value for sys_role_menu.menu_id
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.create_by
     *
     * @return the value of sys_role_menu.create_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.create_by
     *
     * @param createBy the value for sys_role_menu.create_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.create_time
     *
     * @return the value of sys_role_menu.create_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.create_time
     *
     * @param createTime the value for sys_role_menu.create_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.last_update_by
     *
     * @return the value of sys_role_menu.last_update_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.last_update_by
     *
     * @param lastUpdateBy the value for sys_role_menu.last_update_by
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_menu.last_update_time
     *
     * @return the value of sys_role_menu.last_update_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_menu.last_update_time
     *
     * @param lastUpdateTime the value for sys_role_menu.last_update_time
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbg.generated Sun Nov 08 23:11:14 GMT+08:00 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}