package cn.rbac.entity.pojo;

import java.io.Serializable;

/**
 * (RoleMenu)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
public class RoleMenu implements Serializable {
    private static final long serialVersionUID = 234329476893817875L;

    private Integer id;

    private Integer roleId;

    private Integer menuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}

