package practise_project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] emails = {"bijaya@yahoo.com", "binod@gmail.com", "bijaya@gmail.com", "binod@yahoo.com"}; 
		Scanner input = new Scanner(System.in);
		String check="";
		
		boolean matchFound=false;;
		
		while(matchFound==false) {
		System.out.println("Enter the email: ");
		check = input.nextLine();
		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\.com");
		Matcher matcher = pattern.matcher(check);
		matchFound = matcher.find();
		if(matchFound) {
			break;
		}
		else {
			System.out.println("Invalid email type. Please type again\n");
			continue;
		}
		}
		boolean result = checkEmail(emails, check);
		
		if(result) {
			System.out.println("your email is in the list\n");
		}
		else {
			System.out.println("Your email is not in the list\n");
		}
		input.close();
		
	}

	private static boolean checkEmail(String[]emails,String check) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<emails.length; i++) {
			if(emails[i].equals(check)) {
				return true;
			}
			
		}
		return false;
		
	}

}
