package com.sjx.mango.admin.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author sjx
 */
public class JwtTokenUtils{

    private static final long serialVersionUID = 1L;
    private static final String USERNAME = Claims.SUBJECT;
    private static final String CREATED = "created";
    private static final String AUTHORITIES = "authorities";
    private static final String SECRET = "root";
    private static final long EXPIRE_TIME = 12 * 60 * 60 * 1000;


    /**
     *
     * @param request 请求
     * */
    public static Authentication getAuthenticationFromToken(HttpServletRequest request){
        Authentication authentication = null;
        String token = getToken(request);
        if (token !=null){
            if (SecurityUtils.getAuthentication() == null){
                Claims claims = getClaimsFromToken(token);
                if(claims == null){
                    return null;
                }
                String userName = claims.getSubject();
                if (userName == null){
                    return null;
                }
                if (isTokenExpired(token)){
                    return null;
                }
                Object authors = claims.get(AUTHORITIES);
                List<GrantedAuthority> authorities = new ArrayList<>();
                if (authors instanceof List){
                    for (Object obj: (List)authors){

                    }
                }
            }
        }
        return null;
    }
    /**
    * 尝试从请求头中获取请求携带的令牌
     * 默认从请求头中的"Authorization"参数中以"Bearer"开头的信息为令牌信息
     * 若为空则尝试从token参数获取
    * @param request http请求
     */
    public static String getToken(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        String tokenHead = "Bearer";
        if (token == null) {
            token = request.getHeader("token");
        }else{
            if (token.contains(tokenHead)){
                token = token.substring(tokenHead.length());
            }
        }
        if ("".equals(token)){
            token = null;
        }
        return token;
    }
    /**
     * 从令牌中获取数据声明
     *
     * @param token 令牌
     * @return 数据声明
     */
    private static Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            claims = null;
        }
        return claims;
    }

     /** 判断令牌是否过期
     * @param token 令牌
     * @return 是否过期
     */
    public static Boolean isTokenExpired(String token) {
        try {
            Claims claims = getClaimsFromToken(token);
            Date expiration = claims.getExpiration();
            return expiration.before(new Date());
        } catch (Exception e) {
            return false;
        }
    }

}
