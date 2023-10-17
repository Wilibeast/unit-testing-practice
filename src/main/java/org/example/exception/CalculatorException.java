package org.example.exception;

public class CalculatorException extends RuntimeException {
    public CalculatorException(String message, Throwable cause) {
        super(message,cause);
    }
}
