package io.github.kings1990.fastrequestsamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyChildController extends BaseController{
    @GetMapping("/test1")
    public String test1(@RequestParam(required = false) String str){
        return str;
    }

    
}
