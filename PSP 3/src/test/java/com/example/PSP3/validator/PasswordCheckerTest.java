package com.example.PSP3.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

class PasswordCheckerTest {
	
	private PasswordChecker passwordChecker;
	
	@Before(value = "")
    public void setUp() {
        passwordChecker = new PasswordChecker();
      //  phoneValidator = new PhoneValidator();
       // emailValidator = new EmailValidator();
    }

	
	@Test
    public void test_password_length_not_shorter_than_x() {
        String password = "tespas";
        int minLength = 6;

        assertTrue(passwordChecker.containsMinSymbols(password, minLength));
    }
	
	@Test
    public void test_password_contains_uppercase() {
        String password = "Testpas";
        assertTrue(passwordChecker.containsUppercase(password));
    }

    @Test
    public void test_password_contains_special_symbols() {
        String specialSymbols = "test#$%^&*()!";
        assertTrue(passwordChecker.containsSpecialSymbols(specialSymbols));
        }
}