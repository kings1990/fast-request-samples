package io.github.kings1990.fastrequestsamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/script")
@RestController
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







