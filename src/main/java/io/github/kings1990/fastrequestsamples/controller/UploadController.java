package io.github.kings1990.fastrequestsamples.controller;

import io.github.kings1990.fastrequestsamples.vo.Book;
import io.github.kings1990.fastrequestsamples.vo.MultipartParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/testUpload")
public class UploadController {

    @PostMapping("upload")
    public void upload(MultipartParam multipartParam) {
        System.out.println(1);
    }

    @PostMapping("upload1")
    public void upload1(@RequestParam MultipartFile file) {
        System.out.println(1);
    }

    @PostMapping("upload3")
    public void upload3(@RequestPart MultipartFile file, Book book) {
        System.out.println(1);
    }
}

