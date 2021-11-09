package com.example.PSP3.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

class EmailValidatorTest {

	//private PasswordChecker passwordChecker;
   // private PhoneValidator phoneValidator;
    private EmailValidator emailValidator;

    @Before(value = "")
    public void setUp() {
    //    passwordChecker = new PasswordChecker();
    //    phoneValidator = new PhoneValidator();
        emailValidator = new EmailValidator();
    }
	@Test
    public void test_email_has_at_symbol() {
        String email = "test@test.com";
        assertTrue(emailValidator.containsAtSymbol(email));
    }

    @Test
    public void test_email_has_no_whitespace() {
        String email = ";@test.lt";
        assertFalse(emailValidator.isValidSymbols(email));
    }

    @Test
    public void test_email_has_no_invalid_symbol() {
        String email = "john..doe@example.com";
        assertFalse(emailValidator.isValidSymbols(email));
        email = "john.doe@example..com";
        assertFalse(emailValidator.isValidSymbols(email));
        email = "a\"b(c)d,e:f;gi[j\\k]l@example.com";
        assertFalse(emailValidator.isValidSymbols(email));

    }
    @Test
    public void test_email_contains_valid_domain_and_tld() {
        String email = "test@test.lt";
        assertTrue(emailValidator.isValidDomain(email));
    }
}
