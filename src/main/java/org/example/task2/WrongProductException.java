package org.example.task2;

public class WrongProductException extends RuntimeException{
    public WrongProductException() {
        super("Product does not exist");
    }
}
