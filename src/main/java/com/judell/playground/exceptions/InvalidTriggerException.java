package com.judell.playground.exceptions;

/**
 * Creates custom excpetion
 */
public class InvalidTriggerException extends Exception {
    public InvalidTriggerException(String errorMessage){
        super(errorMessage);
    }
}
