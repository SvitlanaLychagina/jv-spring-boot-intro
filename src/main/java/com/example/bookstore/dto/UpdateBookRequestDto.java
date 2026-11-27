package com.example.bookstore.dto;

import com.example.bookstore.validation.Isbn;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UpdateBookRequestDto {
    private String title;
    private String author;
    @Isbn
    private String isbn;
    @Positive(message = "price must be positive")
    private BigDecimal price;
    private String description;
    private String coverImage;
}
