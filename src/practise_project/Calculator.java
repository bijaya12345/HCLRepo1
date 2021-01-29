package practise_project;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operation you want to procede. Use space after each number and arithmetic operators");
		String s= input.nextLine();
		String[] comp = s.split("\\+|\\-|\\*|\\/");
		String[] comp2 = s.split(" ");
		
		//System.out.println(Arrays.toString(comp2));
		//System.out.println(Arrays.toString(comp));
		double[] parseComp = new double[comp.length];
		for(int i=0; i<comp.length; i++) {
			parseComp[i] = Double.parseDouble(comp[i]);
		}
		//System.out.println(Arrays.toString(parseComp));
		int j=1;
		double finalResult = parseComp[0];
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
			j=j+2;
		}
		
		System.out.println("You answer is: "+finalResult);

	}

}
