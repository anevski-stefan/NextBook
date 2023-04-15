package com.example.backend.sharedlibrary.model.exceptions;

public class InvalidArgumentsException extends RuntimeException{
    public InvalidArgumentsException() {
        super("Invalid arguments exception");
    }
}
