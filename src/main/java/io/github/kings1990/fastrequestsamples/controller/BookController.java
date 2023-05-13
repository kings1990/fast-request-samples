package io.github.kings1990.fastrequestsamples.controller;


import io.github.kings1990.fastrequestsamples.vo.Book;
import io.github.kings1990.fastrequestsamples.vo.TaskSettle;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Book controller
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping("/aaaa")
    public String aaaa(@RequestBody List<TaskSettle> list) throws IOException {
        return "";
    }

    @PostMapping("/bbbbb")
    public String bbbb(@RequestBody Map<String,Object> map) throws IOException {
        return "";
    }



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
    public Book updateBookName(@RequestBody Book book) {
        return book;
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
