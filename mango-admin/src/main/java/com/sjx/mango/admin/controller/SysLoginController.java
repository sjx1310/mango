package com.sjx.mango.admin.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
