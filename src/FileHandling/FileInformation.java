package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileInformation {

	public static void main(String[] args) {

		//Creating and getting info about file:
		try {
			File myObj = new File("C:\\Users\\38975\\Desktop\\Coding2\\FileHandling\\text2.txt");
			if(myObj.createNewFile()){
				System.out.println("File name: "+ myObj.getName());
				System.out.println("Absolute path: "+ myObj.getAbsolutePath());
				System.out.println("Writeable: "+ myObj.canWrite());
				System.out.println("Readable: "+ myObj.canRead());
				System.out.println("File size in bytes: "+ myObj.length());
			}
			else {
				System.out.println("File name: "+ myObj.getName());
				System.out.println("Absolute path: "+ myObj.getAbsolutePath());
				System.out.println("Writeable: "+ myObj.canWrite());
				System.out.println("Readable: "+ myObj.canRead());
				System.out.println("File size in bytes: "+ myObj.length());
			}
		}
		catch(IOException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}

	}

}
