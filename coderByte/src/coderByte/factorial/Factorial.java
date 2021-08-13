package coderByte.factorial;

import java.util.Scanner;

public class Factorial {

	/*Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. 
	For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
	For the test cases, the range will be between 1 and 18 and the input will always be an integer.*/
	
	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
	}

	public static int FirstFactorial(int num) {
		Integer factorial = 1;
		if (num != 1) {
			while (num != 0) {
				factorial = factorial * num;
				num--;
			}
		} else {
			factorial = 1;
		}
		return factorial;

	}

}
