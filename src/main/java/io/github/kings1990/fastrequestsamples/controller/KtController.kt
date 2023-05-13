package io.github.kings1990.fastrequestsamples.controller;



import io.github.kings1990.fastrequestsamples.vo.TaskSettle
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/kt")
@RestController
class KtController {

    @PostMapping("test1")
    fun test1(@RequestBody taskSettles: List<TaskSettle>):List<TaskSettle> {
        return taskSettles;
    }

    @PostMapping("test2")
    fun test2(@RequestBody map: MutableMap<String,Any>) : MutableMap<String,Any>{
        return map;
    }


}
