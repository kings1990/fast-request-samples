package io.github.kings1990.fastrequestsamples.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.github.kings1990.fastrequestsamples.vo.BaseResponse;
import io.github.kings1990.fastrequestsamples.vo.Book;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/testReturn")
@RestController
public class TestReturnController {
    /**
     * Get book by id
     *
     * @param id book id
     * @return
     */
    @GetMapping("/{id}")
    public BaseResponse<Book> getBook(@PathVariable Integer id) {
        //mock data for book
        Book b = new Book();
        b.setDescription("Some skill of java");
        b.setBookName("Effective java");
        b.setId(id);
        return new BaseResponse<Book>(200, "success", b);
    }


    @GetMapping("/filtering")
    public MappingJacksonValue filtering() {

        Book someBean = new Book(1, "bookName", "book description");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("id");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",
                filter);

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }


}
