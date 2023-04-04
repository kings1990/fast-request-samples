package io.github.kings1990.fastrequestsamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/script")
@Controller
public class ScriptController {

    /**
     * pre script test
     * @param req
     * @return
     */
    @PostMapping("pre")
    public String preScriptTest(HttpServletRequest req) {
        return req.getHeader("key");
    }
    
}







