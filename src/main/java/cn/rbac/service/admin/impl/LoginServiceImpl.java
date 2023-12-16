package cn.rbac.service.admin.impl;

import cn.rbac.entity.bean.Result;
import cn.rbac.entity.bean.ResutlMessage;
import cn.rbac.entity.pojo.User;
import cn.rbac.mapper.admin.UserMapper;
import cn.rbac.service.admin.LoginService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 登录
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {
        // 1.查询数据信息
        User quser = userMapper.selectOne(new QueryWrapper<User>().eq("username", user.getUsername()));
        // 2.校验用户
        if (quser == null) {
            return Result.fail(500, ResutlMessage.LOGIN_FAIL_USERNAME);
        }
        if (quser.getPassword() != user.getPassword()) {
            return Result.fail(500, ResutlMessage.LOGIN_FAIL_PASSWORD);
        }
        // 3.返回信息
        return Result.ok(ResutlMessage.LOGIN_SUCCESS);
    }
}
