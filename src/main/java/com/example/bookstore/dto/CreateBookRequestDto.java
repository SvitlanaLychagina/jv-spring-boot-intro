package com.example.bookstore.dto;

import com.example.bookstore.validation.Isbn;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    @NotBlank(message = "title is required")
    private String title;
    @NotBlank(message = "author is required")
    private String author;
    @Isbn
    private String isbn;
    @NotNull(message = "price is required")
    @Positive(message = "price must be positive")
    private BigDecimal price;
    private String description;
    private String coverImage;
}
