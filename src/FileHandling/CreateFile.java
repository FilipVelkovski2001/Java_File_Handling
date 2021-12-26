package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		//Creating a file:
		try {
			File myObj = new File("C:\\Users\\38975\\Desktop\\Coding2\\FileHandling\\file1.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: "+ myObj.getName());
			}
			else {
				System.out.println("File already exists!");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured!");
			e.printStackTrace();
		}

	}

}
