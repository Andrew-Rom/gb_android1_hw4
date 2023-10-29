package org.example.task1;

import java.util.Arrays;

public class ValidationUser {
    public static void main() {
        String[][] values = {
                {"userLogin", "correctedUserPassword", "correctedUserPassword"},
                {"tooLongLengthUserLogin", "simpleCorrectUserPassword", "simpleCorrectUserPassword"},
                {"userLogin", "shortPassword", "shortPassword"},
                {"userLogin", "incorrectUserPassword", "simpleCorrectUserPassword"},
                {"tooLongLengthUserLogin", "incorrectPass", "simpleCorrectUserPassword"}
        };

        for (String[] value : values) {
            try {
                System.out.println(auth(value[0], value[1], value[2]));
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Entered: " + Arrays.toString(value));
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entered: " + Arrays.toString(value));
                System.out.println("Unknown error");
            }
        }
    }

    public static boolean auth(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean validPassword = password.equals(confirmPassword);
        if (login.length() >= 20) {
            throw new WrongLoginException(login.length());
        } else if (password.length() < 20 || !validPassword) {
            throw new WrongPasswordException(password.length(), validPassword);
        } else {
            return true;
        }
    }
}
