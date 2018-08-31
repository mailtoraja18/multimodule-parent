package com.rajaram.mmservices;


import com.rajaram.mmdata.Book;
import com.rajaram.mmdb.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getbooks () {return bookRepository.findAll();}

}
