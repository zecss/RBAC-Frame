package cn.rbac.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {

    private static final String SALT = "rbac";

    /**
     * @Description 创建token
     * @param map 负载map
     * @return String
    */

    public static String getToken(Map<String, String> map) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 5);
        JWTCreator.Builder builder = JWT.create();
        //参数
        map.forEach((k, v) -> {
            builder.withClaim(k, v);
        });
        //过期时间
        //加密算法
        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(SALT));

        return token;
    }

    /**
     * @Description 验证token合法性，不合法就会抛出异常
     * @param token
    */
    public static DecodedJWT verify(String token) {
        return JWT.require(Algorithm.HMAC256(SALT)).build().verify(token);
    }

}
