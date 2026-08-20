package org.example.employeepayrollapp.exception;

public class InvalidRegisterRequestException extends RuntimeException{

    public InvalidRegisterRequestException(String msg){
        super(msg);
    }
}
