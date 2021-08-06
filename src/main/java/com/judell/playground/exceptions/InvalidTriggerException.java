package com.judell.playground.exceptions;

public class InvalidTriggerException extends RuntimeException {

    public InvalidTriggerException(String errorMessage){
        super(errorMessage);
    }
}
