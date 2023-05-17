package io.github.kings1990.fastrequestsamples.controller;


import cn.hutool.core.date.DateUtil;
import io.github.kings1990.fastrequestsamples.vo.LoginResponse;
import io.github.kings1990.fastrequestsamples.vo.LoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/auth")
public class LoginController {
    /**
     * 登录
     * @param loginVo
     * @param req
     * @return
     */
    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginVo loginVo,HttpServletRequest req) {
        //do some auth logic
        LoginResponse loginResponse = new LoginResponse();
        System.out.println("login...");
        loginResponse.setToken(DateUtil.offsetSecond(new Date(),30).toString());
        loginResponse.setUserName("kings");
        return loginResponse;
    }
}
