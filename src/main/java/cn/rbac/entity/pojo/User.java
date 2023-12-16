package cn.rbac.entity.pojo;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
public class User implements Serializable {
    private static final long serialVersionUID = -34954118809842913L;

    private Integer id;

    private String username;

    private String password;

    private String phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

