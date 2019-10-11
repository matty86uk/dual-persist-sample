package com.example.dualpersistsample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BasketDoesNotExistException extends RuntimeException {

    public BasketDoesNotExistException(String s) {
        super(s);
    }
}
