package inclasswork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//for checked exception
//when user dont want to use try catch block
public class Throws {

	public static void main(String[] args) {

		try {
			parseDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Throw is use for clients to handle exceptions.
		int age = 4;
		if (age < 18) {
			throw new InvalidTypeException("you are under age");
		}

	}

	// parse exception is checked
	public static void parseDate() throws ParseException {
		String date = "02/03/2020";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date d = sdf.parse(date);
		System.out.println(d);
	}

}
