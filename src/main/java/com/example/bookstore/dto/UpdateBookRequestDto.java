package com.example.bookstore.dto;

import com.example.bookstore.validation.Isbn;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UpdateBookRequestDto {
    private String title;
    private String author;
    @Isbn
    private String isbn;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
