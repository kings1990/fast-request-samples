package io.github.kings1990.fastrequestsamples.controller;


import io.github.kings1990.fastrequestsamples.vo.Book;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Book controller
 */
@RestController
@RequestMapping("/book")
public class BookController {


    /**
     * book detail by id
     * @param id xxxid
     * @return
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return new Book(id,"Effective java","Some skills of java");
    }

    /**
     * delete book
     * @param id xxxid
     * @return
     */
    @DeleteMapping("/{id}")
    public boolean deleteBook(@PathVariable Integer id){
        return true;
    }


    /**
     * add book
     * @param book
     * @param request
     * @return
     */
    @PostMapping("add")
    public Book saveBook(@RequestBody Book book, HttpServletRequest request) {
        return book;
    }

    /**
     * update book
     * @param book
     * @return
     */
    @PutMapping("update")
    public Book updateBook(Book book) {
        return book;
    }

    /**
     * update book name
     * @param book
     * @return
     */
    @PatchMapping("updateBookName")
    public Book updateBookName(Book book) {
        return book;
    }


    /**
     * 测试1
     * @param bookName
     * @return
     */
    @GetMapping("test1")
    public String test1(@RequestParam String bookName) {
        return bookName;
    }

    /**
     * test2
     * @param bookName
     * @param response
     * @return
     * @throws IOException
     */
    @GetMapping("test2")
    public String test2(@RequestParam String bookName, HttpServletResponse response) throws IOException {
        response.sendRedirect("/book/test3");
        return "";
    }

    /**
     * test3 method
     * @return
     */
    @GetMapping("test3")
    public String test3() {
        return "";
    }





    /**
     * search by book name
     * @param bookName bookname123
     * @return
     */
    @GetMapping("queryByName")
    public String queryByName(@RequestParam(required = false) String bookName) {
        return bookName;
    }

    @GetMapping("queryByIds")
    public List<String> queryByIds(@RequestParam List<String> idList) {
        return idList;
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



}
