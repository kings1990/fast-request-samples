package io.github.kings1990.fastrequestsamples.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Book {
    /**
     * book id
     */
    private Integer id;
    /**
     * book name
     */
    private String bookName;


    /**
     * book description
     */
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Book() {
    }

    public Book(Integer id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Book(Integer id, String name,String description) {
        this.id = id;
        this.bookName = bookName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + bookName + '\'' +
                '}';
    }
}
