package com.example.PSP3.validator;

import java.util.ArrayList;
import java.util.List;

import com.example.PSP3.model.Vartotojas;

public class PasswordChecker {
	
	
	
	public static char[] specials = {'@', '#', '!', '~', '$', '%', '^', '&', '*', '(', ')', '-', '+', '/', ':', '.', ',', '<', '>', '?', '|'};


    // checks password length
    public static boolean containsMinSymbols(String pass, int length) {
        if (pass.length() >= length) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean containsUppercase(String pass) {
    	
    	for(int i=0;i<pass.length();i++){
        	if(Character.isUpperCase(pass.charAt(i))){
            	return true;
            }
        }
    	return false;
    }
    
    public static boolean containsSpecialSymbols(String pass) {
    	String chars = specials.toString();

        for (int i = 0; i <= pass.length(); i++) {

            for (int j = 0; j <= chars.length(); j++) {
                if (pass.charAt(i) == specials[j])
                    return true;
            }
        }
        return false;
    }
    
}
