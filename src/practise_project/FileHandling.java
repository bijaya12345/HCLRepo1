/*
 * In this class, user can create, write and read file. 
 * test.txt file is created inside HclPractice folder.
 * To append file, run Appendfile.java file
 */

package practise_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {

		File sp = new File("test.txt");
		createFile(sp);
		writeFile(sp);
		readFile(sp);
	}

	private static void createFile(File sp) {

		try {
			if (sp.createNewFile()) {
				System.out.println("File created");
			} else {
				System.out.println("File already exists");
			}

		} catch (IOException e) {
			System.out.println("Error occured");
		}

	}

	public static void writeFile(File sp) {
		FileWriter sd = null;
		try {
			sd = new FileWriter("test.txt");
			sd.write("Hello World. Whats up.\nHey you");
			sd.close();
			System.out.println("Successfully written in file");
		} catch (Exception e) {
			System.out.println("Error occured");
		}

	}

	@SuppressWarnings("resource")
	private static void readFile(File sp) {
		try {
			System.out.println("Reading a file starts below: \n");
			Scanner scan = new Scanner(sp);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
