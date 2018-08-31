package com.rajaram.mmdb;

import com.rajaram.mmdata.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBLoader implements CommandLineRunner {

    private BookRepository bookRepository;

    public DBLoader(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Book one = new Book("A");
        Book two = new Book("B");
        Book three = new Book("C");
        List<Book> books = Arrays.asList(one,two,three);
        this.bookRepository.saveAll(books);
    }
}
