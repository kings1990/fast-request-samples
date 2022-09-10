package io.github.kings1990.fastrequestsamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testJavadoc")
public class TestJavadocController {


    /**
     * testPathParam
     * @param id  some id
     * @return
     */
    @GetMapping("/testPathParam/{id}")
    public Integer testPathParam(@PathVariable Integer id){
        return id;
    }

    /**
     * testPathParam
     * @param id some id
     * @param name some name
     * @return
     */
    @GetMapping("/testUrlParams")
    public String testPathParam(Integer id,String name){
        return name+"+"+id;
    }


}
