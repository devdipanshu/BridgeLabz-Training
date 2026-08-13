package org.example.collegemanagementsystem.exception;

import org.springframework.http.HttpStatus;

public class EmployeeNotFound extends RuntimeException{
    HttpStatus httpStatus;
    int statusCode;
    public EmployeeNotFound(String msg,HttpStatus httpStatus){
        super(msg);
        this.httpStatus = httpStatus;
        this.statusCode = httpStatus.value();
    }
}
