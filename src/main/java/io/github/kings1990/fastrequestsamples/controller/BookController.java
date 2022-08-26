package io.github.kings1990.fastrequestsamples.controller;


import io.github.kings1990.fastrequestsamples.vo.Book;
import io.github.kings1990.fastrequestsamples.vo.MultipartParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("queryByName")
    public String queryByName(@RequestParam(required = false) String bookName) {
        return bookName;
    }

    @GetMapping("testlist")
    public List<String> testlist(@RequestParam List<String> idList) {
        return idList;
    }


    @PostMapping("add")
    public Book saveBook(@RequestBody Book book) {
        return book;
    }

    @GetMapping("hugeResponse")
    public List<Book> bookList() {
        List<Book> bookList = new ArrayList<Book>();
        for (int i = 0; i < 1111; i++) {
            StringBuilder bookName = new StringBuilder(i + "");
            for (int i1 = 0; i1 < 1000; i1++) {
                bookName.append(i1);
            }
            bookList.add(new Book(i, bookName.toString()));
        }
        return bookList;
    }

    @PostMapping("upload")
    public void upload(MultipartParam multipartParam) {
        System.out.println(1);
    }

    @PostMapping("upload1")
    public void upload1(@RequestParam MultipartFile file) {
        System.out.println(1);
    }

    @GetMapping("test2")
    public Integer test(@RequestParam(defaultValue = "10") Integer id) {
        return id;
    }

}
