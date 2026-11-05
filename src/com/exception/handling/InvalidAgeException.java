package com.exception.handling;

public class InvalidAgeException extends Exception{
    //Whenever we create custom exception and if it extends Exception class - we are creating Compile Time Exception
    //To create runtime exception, our custom exception class needs to extend the Run Time Exception class
    public InvalidAgeException(String message){
        super(message);
    }
}
