package com.wkh.exception.demo1;

public class NameFormatException extends RuntimeException{

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
