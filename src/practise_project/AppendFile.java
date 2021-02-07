package practise_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;

public class AppendFile {

	public static void main(String[] args) {
		File sp = null;
		sp = new File("test.txt");
		if (sp.exists()) {
			System.out.println("Already exists");
		} else {
			try {
				sp.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		appendfile(sp);

	}

	private static void appendfile(File sp) {
		BufferedWriter buffWriter = null;
		String myData = "\nHere is the appended one";
		try {
			FileWriter sm = new FileWriter(sp, true);
			buffWriter = new BufferedWriter(sm);
			buffWriter.write(myData);
			// PrintWriter pWriter = new PrintWriter(buffWriter);
			// pWriter.print(myData);
			// pWriter.close();
			buffWriter.close();
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

}
