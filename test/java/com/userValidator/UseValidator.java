package com.userValidator;
import org.junit.Assert;
import org.junit.Test;
public class UseValidator {

    @Test
    public void givenFirstNameReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("Seema");
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("12");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validateLastName("Gade");
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("as");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validateEmail("Seemagade@gmail.com");
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("see@123");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validatePhoneNumber("7745853122");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumberIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("see@123");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPaasWordEightCharacterReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validateEmail("Seema@12");
        System.out.println(result);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPaasWordEightCharacterIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("see21");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassWordUpperCaseReturnTrue() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("Seema");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    @Test
    public void PassWordUpperCaseIsIncorrect_False() {
        UserValidator user = new UserValidator();
        boolean result = user.validateFirstName("as");
        System.out.println(result);
        Assert.assertFalse(result);
    }


}







