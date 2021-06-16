package com.company.Exceptions;

public class WrongOrderTypeException extends Exception {
    public WrongOrderTypeException() { }
    public WrongOrderTypeException(String message){
        super(message);
    }
}
