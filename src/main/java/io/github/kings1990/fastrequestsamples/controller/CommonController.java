package io.github.kings1990.fastrequestsamples.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * 
 */
@Controller
public class CommonController {

    /**
     * generate captcha
     * @param httpServletRequest
     * @param httpServletResponse
     * @throws Exception
     */
    @GetMapping("/common/kaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/png");

        CircleCaptcha shearCaptcha= CaptchaUtil.createCircleCaptcha(150, 30, 4, 2);
 
        // set code to session
        httpServletRequest.getSession().setAttribute("verifyCode", shearCaptcha);
 
        // write image stream
        shearCaptcha.write(httpServletResponse.getOutputStream());
    }

}