package FileHandling;

import java.io.File;

public class FileDeleting {

	public static void main(String[] args) {
		{     //Deleting a file:
			try  
			{         
			File f= new File("C:\\Users\\38975\\Desktop\\Coding2\\FileHandling\\demo.txt");//file to be delete  
			if(f.delete())                      //returns Boolean value  
			{  
			System.out.println(f.getName() + " deleted");   //getting and printing the file name  
			}  
			else  
			{  
			System.out.println("failed");  
			}  
			}  
			catch(Exception e)  
			{  
			e.printStackTrace();  
			}  

	}

	}
}
