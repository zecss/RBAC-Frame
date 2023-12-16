package cn.rbac.entity.pojo;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 601235170068988040L;

    private Integer id;

    private String rolename;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

}

