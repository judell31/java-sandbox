package com.judell.playground.exceptions;

/**
 * Creates custom excpetion
 */
public class InvalidTriggerException extends RuntimeException {
    public InvalidTriggerException(String errorMessage){
        super(errorMessage);
    }
}
