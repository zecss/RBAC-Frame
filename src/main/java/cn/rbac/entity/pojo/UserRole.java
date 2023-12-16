package cn.rbac.entity.pojo;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 112808767742558967L;

    private Integer id;

    private Integer userId;

    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}

