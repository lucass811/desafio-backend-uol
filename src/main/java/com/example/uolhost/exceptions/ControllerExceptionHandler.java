package com.example.uolhost.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception) {
        ExceptionDTO dto = new ExceptionDTO("Essa lista não possui mais usuários disponiveis", "400");
        return ResponseEntity.badRequest().body(dto);
    }
    
}