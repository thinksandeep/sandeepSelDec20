package week1.day1;

import java.util.Scanner;

//import java.util.Scanner;

public class AssignmentFactorial {

	//private static Scanner scan;

	public static void main(String[] args) {
		
		//Goal: Find the Factorial of a given number
		// 5 factorial is  5*4*3*2*1 = 120
		// int input =5;
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int fact =1;
		
		for (int i = 1; i <= input; i++) {
			// ist ite 1= 1*1
			//  2nd ite 2= 2*3
			// 3rd 6 = 6*4
			// 4th 24 = 24 * 5
			// fact result is stored to fact = 120. 
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
