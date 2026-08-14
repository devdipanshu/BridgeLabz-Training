package org.example.contactapp.exception;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class ContactNotFoundException extends RuntimeException{

    private HttpStatus status;
    public ContactNotFoundException(String msg, HttpStatus status){
        super(msg);
        this.status = status;
    }

}
