package cn.rbac.controller.admin;

import cn.rbac.entity.bean.Result;
import cn.rbac.entity.pojo.User;
import cn.rbac.service.admin.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 用户功能
 */
@RestController
@RequestMapping("admin")
public class UserController {

    @Autowired
    private LoginService loginService;


    /**
     * @Description 登录接口
     */
    @PostMapping("login")
    public Result login(@RequestBody User user){
        return loginService.login(user);
    }


    /**
     * @Description 获取用户列表
     */
    @GetMapping("getlist")
    public Result getList() {
        return Result.ok();
    }

    /**
     * @Description 获取用户信息
     */
    @GetMapping("getinfo/{id}")
    public Result getInfo(@PathVariable Integer id) {
        return Result.ok();
    }
}
