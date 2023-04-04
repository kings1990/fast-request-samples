package io.github.kings1990.fastrequestsamples.controller;

import io.github.kings1990.fastrequestsamples.vo.Book;
import io.github.kings1990.fastrequestsamples.vo.MultipartParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/testUpload")
public class UploadController {

    /**
     * upload single file
     * @param file
     */
    @PostMapping("uploadSingle")
    public void uploadSingle(@RequestParam MultipartFile file) {
        System.out.println(1);
    }

    /**
     * upload single file with entity
     * @param multipartParam
     */
    @PostMapping("uploadSingleWithEntity")
    public void uploadSingleWithEntity(MultipartParam multipartParam) {
        System.out.println(1);
    }


    /**
     * upload multiple file
     * @param file
     */
    @PostMapping("uploadMultiple")
    public void uploadMultiple(@RequestPart MultipartFile[] file) {
        System.out.println(1);
    }

    /**
     * mix upload file
     * @param file
     */
    @PostMapping("mixUpload")
    public void upload3(@RequestPart MultipartFile file, Book book) {
        System.out.println(1);
    }
}

