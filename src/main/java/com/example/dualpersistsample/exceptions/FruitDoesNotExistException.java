package com.example.dualpersistsample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FruitDoesNotExistException extends RuntimeException {

    public FruitDoesNotExistException(String s) {
        super(s);
    }
}
