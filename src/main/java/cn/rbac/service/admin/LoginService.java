package cn.rbac.service.admin;

import cn.rbac.entity.result.CommonResult;
import cn.rbac.entity.pojo.User;

/**
 * @Description TODO
 */
public interface LoginService {
    CommonResult login(User user);
}
