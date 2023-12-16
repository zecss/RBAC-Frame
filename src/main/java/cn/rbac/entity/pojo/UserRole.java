package cn.rbac.entity.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author PushBug
 * @since 2023-12-10 17:17:42
 */
@Data
public class UserRole implements Serializable {

    private Integer id;

    private Integer userId;

    private Integer roleId;

}

