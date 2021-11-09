package com.example.PSP3.validator;

public class EmailValidator {
	
	public static boolean containsAtSymbol(String email) {
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@')
                return true;
        }
        return false;
    }
	
	 public static boolean isValidSymbols(String email) {
	        for(int i = 0; i < email.length(); i++) {
	            if( (email.charAt(i) == '!')
	                || (email.charAt(i) == '~') || (email.charAt(i) == '$')
	                || (email.charAt(i) == '%') || (email.charAt(i) == '^')
	                || (email.charAt(i) == '&') || (email.charAt(i) == '*')
	                || (email.charAt(i) == '-') || (email.charAt(i) == '+')
	                || (email.charAt(i) == ';') || (email.charAt(i) == '[')
	                || (email.charAt(i) == ']') || (email.charAt(i) == '(')
	                || (email.charAt(i) == ')') || (email.charAt(i) == ':')
	                 || (email.charAt(i) == '?')) {return false;}
	            else return true;
	        }
	        return true;
	    }
	 
	 public static boolean isValidDomain(String email) {
	     int position =0;   
		 for(int i = 0; i < email.length(); i++) {
	            if(email.charAt(i) == '.') {
	            	position = i;
	            	break;
	            }
	                
	        }
		 String domain = "";
	        for(int i = position+1; i<email.length(); i++) {
	        	domain = domain + email.charAt(i);
	        }
	        if (domain.equals("lt") || (domain.equals("lv")) || (domain.equals("com"))){
	        	return true;
	        }
	        else return false;
	    }
}
