package io.github.kings1990.fastrequestsamples.controller;


import io.github.kings1990.fastrequestsamples.vo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("queryByName")
    public String queryByName(@RequestParam(required = false) String bookName) {
        return bookName;
    }

    @GetMapping("queryByIds")
    public List<String> queryByIds(@RequestParam List<String> idList) {
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



    @GetMapping("test2")
    public Integer test(@RequestParam(defaultValue = "10") Integer id) {
        return id;
    }

}
