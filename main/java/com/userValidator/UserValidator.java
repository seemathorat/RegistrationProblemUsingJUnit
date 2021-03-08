package com.userValidator;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstName1 = "[A-Z]{1}[a-z]{2,}$";
    private static final String lastName2 = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final String phoneNumber1 = "^([0]+||[91]+) [0-9]{10}$";
    private static final String passwordEightCharacter2 = "^[a-zA-Z0-9]{8,}";
    private static final String passwordUpperCase = "^(?=.*?[A-Z][a-zA-Z0-9]{8,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(firstName1);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastName2);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(email);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(phoneNumber1);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePasswordCheckOne(String passwordEightCharacter) {
        Pattern pattern = Pattern.compile(passwordEightCharacter2);
        return pattern.matcher(passwordEightCharacter).matches();
    }

    public boolean validatePasswordCheckTwo(String passwordUpperCase) {
        Pattern pattern = Pattern.compile(passwordUpperCase);
        return pattern.matcher(passwordUpperCase).matches();
    }
}
