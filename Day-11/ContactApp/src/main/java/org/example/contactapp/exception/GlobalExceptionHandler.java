package org.example.contactapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(ContactNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleContactNotFoundException(ContactNotFoundException contactNotFoundException){
        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .status(contactNotFoundException.getStatus().value())
                .httpStatus(contactNotFoundException.getStatus())
                .msg(contactNotFoundException.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity.status(errorResponse.getHttpStatus()).body(errorResponse);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgument(MethodArgumentNotValidException methodArgumentNotValidException){
        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .status(methodArgumentNotValidException.getStatusCode().value())
                .httpStatus(HttpStatus.valueOf(methodArgumentNotValidException.getStatusCode().value()))
                .msg(methodArgumentNotValidException.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity.status(errorResponse.getHttpStatus()).body(errorResponse);

    }
}
