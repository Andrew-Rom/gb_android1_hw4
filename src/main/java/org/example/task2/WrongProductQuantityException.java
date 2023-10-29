package org.example.task2;

public class WrongProductQuantityException extends RuntimeException{
    public WrongProductQuantityException() {
        super("Incorrect quantity of product");
    }
}
