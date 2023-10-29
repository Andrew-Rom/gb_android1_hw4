package org.example.task1;

public class WrongLoginException extends RuntimeException {
    private int loginLen;
    private final int loginLenMax = 20;

    public WrongLoginException() {
        super("Login length is incorrect");
    }

    public WrongLoginException(int loginLen) {
        super();
        this.loginLen = loginLen;
    }

    @Override
    public String getMessage() {
        return "Login length must be less than " + loginLenMax + " (entered " + loginLen + ").";
    }
}
