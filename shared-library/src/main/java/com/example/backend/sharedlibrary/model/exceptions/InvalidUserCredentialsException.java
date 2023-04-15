package com.example.backend.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException{
    public InvalidUserCredentialsException() {
        super("Invalid user credentials exception");
    }
}
