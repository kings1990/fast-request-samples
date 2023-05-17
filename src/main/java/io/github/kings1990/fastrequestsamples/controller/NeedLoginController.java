package io.github.kings1990.fastrequestsamples.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import io.github.kings1990.fastrequestsamples.vo.BaseResponse;
import org.apache.groovy.parser.antlr4.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RequestMapping ("/needLogin")
@RestController
public class NeedLoginController {
    
    @GetMapping (value = "/test1")
    public BaseResponse<String> test1 (HttpServletRequest request) {
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token) || DateUtil.compare(DateUtil.parseDateTime(token),new Date()) < 0){
            return BaseResponse.loginExpire();
        }
        
        return BaseResponse.with(200,RandomUtil.randomString(5));
    }
}







