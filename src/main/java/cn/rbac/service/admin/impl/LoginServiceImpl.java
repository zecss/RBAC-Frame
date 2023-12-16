package cn.rbac.service.admin.impl;

import cn.rbac.entity.result.CommonResult;
import cn.rbac.entity.pojo.User;
import cn.rbac.mapper.admin.UserMapper;
import cn.rbac.service.admin.LoginService;
import cn.rbac.utils.JWTUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 登录
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public CommonResult login(User user) {
        // 1.查询数据信息
        User quser = userMapper.selectOne(new QueryWrapper<User>().eq("username", user.getUsername()));
        // 2.校验用户
        if (quser == null) {
            return CommonResult.fail(500,"用户不存在");
        }
        if (!quser.getPassword().equals(user.getPassword())) {
            return CommonResult.fail(500,"密码错误");
        }
        // 3.生成token
        Map<String, String> map = new HashMap<>();
        map.put("id", quser.getId().toString());
        map.put("username", quser.getUsername());
        String token = JWTUtils.getToken(map);
        // 3.返回信息
        return CommonResult.ok(token);
    }
}
