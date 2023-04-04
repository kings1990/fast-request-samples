package io.github.kings1990.fastrequestsamples.controller;

import io.github.kings1990.fastrequestsamples.vo.EnumVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enum")
public class EnumController {

    @PostMapping("test")
    public String test(EnumVo vo){
        return "";
    }
}
