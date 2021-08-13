package coderByte.factorial;

import java.util.Scanner;

public class Reverse {

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
