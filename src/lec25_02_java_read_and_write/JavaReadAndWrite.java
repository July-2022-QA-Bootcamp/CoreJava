package lec25_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		    // Creating Folder
			// for Mac user -- got to the properties -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
			File folder = new File("C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp");
			folder.mkdir(); // this method make directory or folder
			if(folder.exists()) {
				System.out.println(folder.getName() + " folder is created.");
				// Creating File
				File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp\\July2022.txt");
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
					// learning from today
					System.out.println("<-- Please write something about the students of July2022 -->");
					Scanner scanner = new Scanner(System.in);
					String userInput = scanner.nextLine();
					String path = "C:\\Users\\Tofael\\Desktop\\EnthrallQABootcamp\\July2022.txt";
					try {
						Formatter formatter = new Formatter(path);
						formatter.format("%s", userInput); // %S give data in upper case, Que: why %s in lower case is not working
						formatter.close();
					} catch (Exception f) {
						f.printStackTrace(); // this method print the Exception or you can use sysout like line 25
					}
					System.out.println(
							"Now go to the Desktop, open the folder, then the file and see what is written in the file");
					
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(path);
						System.out.println("FileReader find the location of the path as: " + path);
					} catch (FileNotFoundException g) {
						g.printStackTrace();
					}
					
					String data = " ";
					try {
						br = new BufferedReader(fr);
						while((data = br.readLine()) != null) {			
							System.out.println("The BufferedReader read the file and got : " + data);
						}
					} catch (IOException h) {
						h.printStackTrace();
					} finally {
						if (fr != null) {
							fr = null; // If fr is not null, make it null, mean close the resource.
						}
						if (br != null) {
							br = null; // If br is not null, make it null, mean close the resource.
						}
					}
					scanner.close();					
				} else {
					System.out.println("Exception occured, file is not created");
				}		
			} else {
				System.out.println("Folder is not created");
			}

		}


	

}
