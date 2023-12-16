package cn.rbac.entity.pojo;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = -89677255746956292L;

    private Integer id;
    /**
     * 上级
     */
    private Integer pid;

    private String menuname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

}

