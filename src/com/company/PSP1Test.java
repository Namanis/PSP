package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PSP1Test {

    @BeforeEach
    Password password;
    Phone phone;
    Email email;
    void setUp() {
        password = new Password();
        phone = new Phone();
        email = new Email();
    }

    @Test
    void TestPasswordLength() {
        assertTrue(password.passwordLengthCheck("Qwerty12345", 8)) //check if password is longer or equal 8
    }

    @Test
    void TestPasswordUppercase() {
        assertTrue(password.passwordUppercaseCheck("Qwerty12345"));
    }

    @Test
    void TestPasswordSpecialSymbol () {
        assertTrue(password.passwordSpecialSymbol("Qwerty12345"));
    }

    @Test
    void TestPhoneForNumbers () {
        assertFalse (phone.checkForSymbols("860616152")); //If no symbols test passes
    }

    @Test
    void TestPhoneNumberStructure (){
        assertTrue (phone.startsWith("8")); //test if number starts with 8
    }

    @Test
    void TestPhoneCountryCode () {
        assertTrue (phone.checkCountry( "LT", "+37061603152"));
    }

    @Test
    void TestEmailCheck () {
        assertTrue (email.hasEmailSymbol ("pertas@jonas.com"));
    }

    @Test
    void TestEmailSymbolsCheck () {
        assertFalse (email.hasBadSymbols ("pertas@jonas┘.com"));
    }

    @Test
    void TestEmailDomain () {
        assertTrue (email.hasCorrectDomain ("pertas@jonas.lt"));
    }


    @AfterEach
    void tearDown() {
    }
}
