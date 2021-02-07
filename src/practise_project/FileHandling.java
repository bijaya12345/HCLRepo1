package practise_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {

		File sp = null;
		FileWriter sd = null;
		try {
			sp = new File("test.txt");
			sd = new FileWriter("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		createFile(sp);
		writeFile(sd);
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

	private static void writeFile(FileWriter sd) {

		try {
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
