package coderByte.factorial;

import java.util.Scanner;

public class Reverse {

	/*
	 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
	 * For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.
	 * */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}

	public static String FirstReverse(String str) {
		StringBuilder input1 = new StringBuilder();
		
		input1.append(str);
		input1.reverse();
		
		return input1.toString();
		
	}

}
