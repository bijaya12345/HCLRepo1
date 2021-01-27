package inclasswork;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		char ch1 = 'A';
		int imp1 = ch1; //implicit type casting
		System.out.println("Implicit type casting for " + ch1 + " is " + imp1);
		
		System.out.println("Enter an integer: ");
		int num1 = std.nextInt();
		double imp = num1; //implicit type casting
		System.out.println("Implicit type casting for " + num1 + " is " + imp);
		
		System.out.println("Enter any number of type double: ");
		double num2 = std.nextDouble();	
		int exp = (int) num2;//explicit function
		System.out.println("Explicit type casting for " + num2 + " is " + exp);
		
		std.close();
	}

}
