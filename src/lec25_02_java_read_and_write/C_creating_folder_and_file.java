package lec25_02_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {

	public static void main(String[] args) {
		// Creating Folder
		// for Mac user -- got to the properties -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT");
		folder.mkdir(); // this method make directory or folder
		if(folder.exists()) {
			System.out.println(folder.getName() + " folder is created.");
			// Creating File
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\July2022.txt");
			// An exception can occur
			// IOException is the base class for exceptions thrown while accessing information using streams,
			// files and directories. 
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("The Exception is: " + e);
			}
			
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the EnthrallIT Folder");
			} else {
				System.out.println("Exception occured, file is not created");
			}		
		} else {
			System.out.println("Folder is not created");
		}

	}

}
