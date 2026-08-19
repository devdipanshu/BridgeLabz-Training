package org.example.collegemanagementsystem.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<ErrorResponse> handleEmployeeNotFound(EmployeeNotFound employeeNotFound){
        ErrorResponse errorResponse = ErrorResponse.builder().statusCode(employeeNotFound.statusCode)
                .httpStatus(employeeNotFound.httpStatus)
                .msg(employeeNotFound.getMessage())
                .build();
        return ResponseEntity.status(employeeNotFound.httpStatus).body(errorResponse);
    }

    @ExceptionHandler(FacultyNotFound.class)
    public ResponseEntity<ErrorResponse> handleFacultyNotFound(FacultyNotFound facultyNotFound){
        ErrorResponse errorResponse = ErrorResponse.builder().statusCode(facultyNotFound.statusCode)
                .httpStatus(facultyNotFound.httpStatus)
                .msg(facultyNotFound.getMessage())
                .build();
        return ResponseEntity.status(facultyNotFound.httpStatus).body(errorResponse);
    }
}
