package io.github.kings1990.fastrequestsamples.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(tags="javadoc test")
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
     * test request param
     * @param id some id
     * @param name some name
     * @return
     */
    @PostMapping("/testRequestParam")
    public String testRequestParam(@RequestParam ArrayList<Integer> id, String name){
        return name+"+"+id;
    }


}
