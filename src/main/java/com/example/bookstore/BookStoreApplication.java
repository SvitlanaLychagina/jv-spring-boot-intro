package com.example.bookstore;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreApplication {
    @Autowired
    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book newBook = new Book();
            newBook.setTitle("Harry Potter");
            newBook.setAuthor("Joanne Rowling");
            newBook.setIsbn("978-1-4088-5565-2");
            newBook.setPrice(new BigDecimal(20.00));
            newBook.setDescription("A story about boy who lived");
            newBook.setCoverImage("https://static.yakaboo.ua/media/catalog/product/4/1/41_1_131.jpg");
            bookService.save(newBook);
            System.out.println(bookService.findAll());
        };
    }

}

