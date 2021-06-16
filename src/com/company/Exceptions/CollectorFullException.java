package com.company.Exceptions;

public class CollectorFullException extends Exception{
    public CollectorFullException(){ }
    public CollectorFullException(String message){
        super(message);
    }
}
