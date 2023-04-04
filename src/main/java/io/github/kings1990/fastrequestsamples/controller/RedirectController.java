package io.github.kings1990.fastrequestsamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testRedirect")
public class RedirectController {

    @RequestMapping("/doResponseForward")
    public String doResponseForward(){

        return "redirect:/book/test3";
    }
}
