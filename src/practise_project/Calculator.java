
/* In this simple arithemetic calculator, user can enter their desire operation at once.
	They can use as many operations at once but have to use space after each number and operators.
	For example: if an user want to perform "1+2*3-4/2", user has to enter: "1 + 2 * 3 - 4 / 2"
*/
package practise_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operation you want to procede. Use space after each number and arithmetic operators\n");
		String s= input.nextLine();
		
		//for loop to check space in odd index of string
		for(int i=1; i<s.length();) {
			if(s.charAt(i)!= ' '){
				System.out.println("Please run again and Use Space after each numbers and operators(+,-,*,/) in the format: (Number)(Space)(Operator)(Space)\n");
				System.exit(0);
			}
			i=i+2;
		}
		
		String[] comp = s.split("\\+|\\-|\\*|\\/"); //parsing interms of arithmetic operators
		String[] comp2 = s.split(" ");//parsing so that I can keep track of type of operator
		
		
		double[] parseComp = new double[comp.length]; // an array that can store elements of comp in terms of double type
		for(int i=0; i<comp.length; i++) {
			try {
			parseComp[i] = Double.parseDouble(comp[i]);
			}catch(Exception e) {
				System.out.println("Wrong expression. please run again with correct expression\n");
				System.exit(1);
			};
		}
		
		int j=1; // a variable that is use to get through the comp2 array and get the type of operator.
		double finalResult = parseComp[0]; //finalResult initially storing first element
		for(int i=0; i<comp.length; i++) {
			if(j<comp2.length && comp2[j].equals("+")) {
				finalResult = finalResult + parseComp[i+1];
				
			}
			if(j<comp2.length && comp2[j].equals("-")) {
				finalResult = finalResult - parseComp[i+1];
				
			}
			if(j<comp2.length && comp2[j].equals("*")) {
				finalResult = finalResult * parseComp[i+1];
				
			}
			if(j<comp2.length && comp2[j].equals("/")) {
				finalResult = finalResult / parseComp[i+1];
				
			}
			j=j+2; // operators type are located in every odd location of comp2 array
		}
		
		System.out.println("You answer is: "+finalResult);

	}

}
