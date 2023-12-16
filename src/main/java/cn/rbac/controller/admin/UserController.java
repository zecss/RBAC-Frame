package cn.rbac.controller.admin;

import cn.rbac.entity.result.CommonResult;
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
    public CommonResult login(@RequestBody User user){
        return loginService.login(user);
    }


    /**
     * @Description 获取用户列表
     */
    @GetMapping("getlist")
    public CommonResult getList() {
        return CommonResult.ok();
    }

    /**
     * @Description 获取用户信息
     */
    @GetMapping("getinfo/{id}")
    public CommonResult getInfo(@PathVariable Integer id) {
        return CommonResult.ok();
    }
}
