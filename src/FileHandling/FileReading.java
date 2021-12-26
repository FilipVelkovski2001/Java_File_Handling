package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		//Reading from a file:
		try {
			File myObj = new File("C:\\Users\\38975\\Desktop\\Coding2\\FileHandling\\text2.txt");
			Scanner myScanner = new Scanner(myObj);
			while(myScanner.hasNextLine()) {
				String data = myScanner.nextLine();
				System.out.println(data);
			}
			myScanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}

	}

}
