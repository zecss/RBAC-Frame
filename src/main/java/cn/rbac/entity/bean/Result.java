package cn.rbac.entity.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一结果返回类
 */
@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResutlMessage.SUCCESS);
        return result;
    }

    public static <T> Result ok(String message, T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResutlMessage.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setCode(ResultCode.FAIL);
        result.setMessage(ResutlMessage.FAIL);
        return result;
    }

    public static Result fail(Integer code, String message) {
        Result result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
