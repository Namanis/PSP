package com.example.PSP3.validator;

import java.util.ArrayList;

public class PhoneValidator {
	
	public static ArrayList<String> countryCode = new ArrayList<String>();
    public static ArrayList<Integer> countryNumLength = new ArrayList<Integer>();
    public static ArrayList<String> countryName = new ArrayList<String>();
    
    public static boolean containsInvalidSymbols(String num) {

        for(int i = 0; i <= num.length(); i++) {
            if((num.charAt(i) < '0') || (num.charAt(i) > '9'))
                return true;
        }
        return false;
    }
    
    
    public static String convertPhoneNumber(String num) {
    	if(num.substring(0, 2).equals("86")) {
    		String secondHalf = num.substring(2);
    		num = "+3706" + secondHalf;
    		return num;
    	}
    	else return num;
    }
    
    public static boolean containsCorrectPrefix(String prefix, int prefixLength, String num) {
    	
    	if(prefixLength == 4 && num.substring(0, prefixLength).equals("+370") && prefix.equals("LT")) {
    		return true;
    	}
    	else if (prefixLength == 4 && num.substring(0, prefixLength).equals("+371") && prefix.equals("LV")) {
    		return true;
    	}
    	else if (prefixLength == 4 && num.substring(0, prefixLength).equals("+372") && prefix.equals("EST")) {
    		return true;
    	}
    	
    	else return false;
    }
}
