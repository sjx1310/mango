package com.sjx.mango.admin.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.sjx.mango.admin.model.SysUser;
import com.sjx.mango.admin.security.JwtAuthenticationToken;
import com.sjx.mango.admin.security.LoginBean;
import com.sjx.mango.admin.security.SecurityUtils;
import com.sjx.mango.admin.service.SysUserService;
import com.sjx.mango.admin.utils.PasswordUtils;
import com.sjx.mango.core.http.HttpResult;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author sjx
 */

@RestController
public class SysLoginController{
    @Autowired
    private Producer producer;
    private SysUserService sysUserService;
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletResponse response, HttpServletRequest request)throws Exception{
        response.setHeader("Cache-control","no-store,no-cache");
        response.setContentType("image/jpg");
        String text = producer.createText();
        // 生成文字验证码

        BufferedImage image = producer.createImage(text);
        //生成图片验证码

        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY,text);
        //保存验证码到session
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"jpg",os);
        IOUtils.closeQuietly(os);
    }

    @PostMapping(value = "/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request){
        String username = loginBean.getAccount();
        String password = loginBean.getPassword();
        String captcha = loginBean.getCaptcha();

        Object kaptcha = request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (kaptcha == null){
            return HttpResult.error("验证码已经失效");
        }
        if (!captcha.equals(kaptcha)){
            return HttpResult.error("验证码错误");
        }
        SysUser user = sysUserService.findByName(username);
        if (user == null) {
            return HttpResult.error("用户名不存在");
        }
        if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())){
            return HttpResult.error("密码不正确");
        }
        if(user.getStatus() == 0){
            return HttpResult.error("账号已被锁定");
        }
        //
        JwtAuthenticationToken token = SecurityUtils.login(request, username, password, authentication -> null);
        return HttpResult.ok(token);

    }
}
