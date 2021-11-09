package com.example.PSP3.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

class PhoneValidatorTest {
	
	// private PasswordChecker passwordChecker;
	 private PhoneValidator phoneValidator;
	// private EmailValidator emailValidator;

	 @Before(value = "")
	 public void setUp() {
	 //   passwordChecker = new PasswordChecker();
	    phoneValidator = new PhoneValidator();
	//    emailValidator = new EmailValidator();
	 }
	@Test
    public void test_phone_invalid_symbols() {
        String phoneNumber = "#860000000";
        assertTrue(phoneValidator.containsInvalidSymbols(phoneNumber));
    }

    @Test
    public void test_phone_number_convert() {
        String phoneNumber = "867400000";
        assertEquals(phoneValidator.convertPhoneNumber(phoneNumber),"+37067400000");
    }

    @Test
    public void test_phone_correct_prefix() {
        String phoneNumber = "+37067400000";
        String prefix = "LT";
        int prefixLength = 4;
        assertTrue(phoneValidator.containsCorrectPrefix(prefix, prefixLength, phoneNumber));
    }
}
