package com.exception.handling;

public class InvalidNameException extends RuntimeException{
    //Runtime Exception - not caught by the compiler - unchecked exception
    public InvalidNameException(String message){
        super(message);
    }
}
