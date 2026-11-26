package com.example.bookstore.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class IsbnValidator implements ConstraintValidator<Isbn, String> {
    //TODO:
    private static final String PATTERN_OF_ISBN =
            "(?=[0-9X]{10}$" // ISBN-10 без разделителей
            + "|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$" // ISBN-10 с 3 разделителями
            + "|97[89][0-9]{10}$" // ISBN-13 без разделителей
            + "|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)" // ISBN-13 с 4 разделителями
            + "(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";

    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext constraintValidatorContext) {
        return isbn != null && Pattern.compile(PATTERN_OF_ISBN).matcher(isbn).matches();
    }
}
