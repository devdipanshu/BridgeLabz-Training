package org.example.collegemanagementsystem.exception;

import org.springframework.http.HttpStatus;

public class FacultyNotFound extends RuntimeException{
    HttpStatus httpStatus;
    int statusCode;
    public FacultyNotFound(String msg,HttpStatus httpStatus){
        super(msg);
        this.httpStatus = httpStatus;
        this.statusCode = httpStatus.value();
    }
}
