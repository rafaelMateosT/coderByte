package coderByte.factorial;

import java.util.Scanner;

public class CodelandUsernameValidationPrincipal {

	/*
	 * Have the function CodelandUsernameValidation(str) take the str parameter
	 * being passed and determine if the string is a valid username according to the
	 * following rules: 1. The username is between 4 and 25 characters. 2. It must
	 * start with a letter. 3. It can only contain letters, numbers, and the
	 * underscore character. 4. It cannot end with an underscore character. If the
	 * username is valid then your program should return the string true, otherwise
	 * return the string false.
	 */

	public static void main(String[] args) {
		System.out.println("Enter valid username");
		Scanner s = new Scanner(System.in);
		System.out.print(CodelandUsernameValidation(s.nextLine()));
	}

	public static String CodelandUsernameValidation(String str) {
		String result = "";
		
		if(str.length() < 4 || str.length() > 25) return "false";
		if(!isLetter(str.charAt(0))) return "false";
		if(!validUsername(str)) return "false";
		if(isUnderscore(str.charAt(str.length() -1))) return "false";
		
		return "true";
		
	}

	/*Check if the submit char is a letter*/
	public static boolean isLetter(char c) {
		if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
			return false;
		}

		return true;
	}
	
	
	/*Check if only contain letters, numbers, and the underscore character*/
	public static boolean validUsername(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            if ( !((c >= 'a' && c <= 'z') 
            		|| (c >= 'A' && c <= 'Z')) 
            		&& (!isNumber(c)) && (!isUnderscore(c)) ) {
                return false;
            }
        }
        return true;
    }
	
	/*Check if a string is a number*/
	public static boolean isNumber(char numero){
	    try{
	        Integer.parseInt(String.valueOf(numero));
	        return true;
	    }catch(NumberFormatException e){
	        return false;
	    }
	}
	
	
	/*Check if is underscore*/
	public static boolean isUnderscore(char underscore){
	 return underscore != '_' ? false : true;
	}
	
	
	

}
