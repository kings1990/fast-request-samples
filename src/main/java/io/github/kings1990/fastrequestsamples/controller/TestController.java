package io.github.kings1990.fastrequestsamples.controller;

import io.github.kings1990.fastrequestsamples.constant.MyConstant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping(MyConstant.REPAYMENT_REPAY)
    public String test2(String id, HttpServletResponse res) {
        res.addCookie(new Cookie("abc", "12"));
        return id;
    }


}
