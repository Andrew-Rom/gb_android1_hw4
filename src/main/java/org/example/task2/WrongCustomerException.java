package org.example.task2;

public class WrongCustomerException extends RuntimeException{
    public WrongCustomerException() {
        super("Invalid Customer data");
    }
}
