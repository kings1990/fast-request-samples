package io.github.kings1990.fastrequestsamples.controller;


import io.github.kings1990.fastrequestsamples.vo.LoginResponse;
import io.github.kings1990.fastrequestsamples.vo.LoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginVo loginVo,HttpServletRequest req) {
        String sign = req.getHeader("sign");
        System.out.println(sign);
        System.out.println(loginVo.getUsername());
        System.out.println(loginVo.getPassword());
        //do some auth logic
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken("token");
        loginResponse.setUserName("kings");
        return loginResponse;
    }
}
