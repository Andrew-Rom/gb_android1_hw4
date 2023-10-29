package org.example.task1;

public class WrongPasswordException extends RuntimeException {
    private int passwordLen;
    private final int passwordLenMin = 20;
    private final boolean isCorrectPassword;

    public WrongPasswordException(int passwordLen, boolean isCorrectPassword) {
        super();
        this.passwordLen = passwordLen;
        this.isCorrectPassword = isCorrectPassword;
    }

    @Override
    public String getMessage() {
        String message = null;
        if (passwordLen < passwordLenMin) {
            message = "Password length must be more than " + passwordLenMin + " (entered " + passwordLen + ").";
        }
        if (!isCorrectPassword) {
            message = "Password is invalid.";
        }
        return message;
    }
}
