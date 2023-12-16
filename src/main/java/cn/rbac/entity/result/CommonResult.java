package cn.rbac.entity.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一结果返回类
 */
@Data
public class CommonResult<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public static CommonResult ok() {
        CommonResult result = new CommonResult();
        result.setCode(200);
        result.setMessage("操作成功");
        return result;
    }

    public static <T> CommonResult ok(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setData(data);
        return result;
    }

    public static CommonResult fail() {
        CommonResult result = new CommonResult();
        result.setCode(500);
        result.setMessage("操作失败");
        return result;
    }


    public static CommonResult fail(Integer code, String message) {
        CommonResult result = new CommonResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
