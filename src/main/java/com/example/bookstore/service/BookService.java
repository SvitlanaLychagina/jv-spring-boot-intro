package com.example.bookstore.service;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.dto.CreateBookRequestDto;
import com.example.bookstore.dto.UpdateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    BookDto update(Long id, UpdateBookRequestDto requestDto);

    void deleteById(Long id);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
