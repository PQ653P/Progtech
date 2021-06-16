package com.company.Exceptions;

public class FactoryNotExistException extends Exception {
    public FactoryNotExistException() { }
    public FactoryNotExistException(String message){
        super(message);
    }
}
