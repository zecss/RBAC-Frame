package cn.rbac.entity.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
@Data
public class Role implements Serializable {

    private Integer id;

    private String rolename;

}

