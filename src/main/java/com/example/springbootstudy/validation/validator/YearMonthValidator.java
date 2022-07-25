package com.example.springbootstudy.validation.validator;

import com.example.springbootstudy.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * packageName    : com.example.springbootstudy.validation.validator
 * fileName       : CustomDuplicationNameValidator
 * author         : tkdwk567@naver.com
 * date           : 2022/07/25
 */
public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            LocalDate localDate = LocalDate.parse(value, DateTimeFormatter.ofPattern(this.pattern));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
