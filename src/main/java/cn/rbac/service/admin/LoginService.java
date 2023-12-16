package cn.rbac.service.admin;

import cn.rbac.entity.bean.Result;
import cn.rbac.entity.pojo.User;

/**
 * @Description TODO
 */
public interface LoginService {
    Result login(User user);
}
