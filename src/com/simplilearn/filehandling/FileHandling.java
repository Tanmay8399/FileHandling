package com.simplilearn.filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileHandling {
	
	public static void main(String[] args)throws IOException  {
		Scanner in = new Scanner(System.in);
	System.out.println("Welcome to File handling  ");
	System.out.println("Please enter your choice for:");
	int choice=in.nextInt();
	switch (choice) {
	case 1: System.out.println("Reading the file"); 
	
	  
	    // pass the path to the file as a parameter
	    File file = new File("C:\\Users\\Lenovo\\test.txt");
	    Scanner sc = new Scanner(file);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	break;
	case 2: System.out.println("Write into  the file"); 
	String text
    = "Good morning\nWriting into file was succesful";


Path fileName = Path.of(
    "C:\\Users\\Lenovo\\test.txt");


Files.writeString(fileName, text);
String file_content = Files.readString(fileName);
System.out.println(file_content);
	break;
	case 3: System.out.println("Append the file"); 
	{
		String textToAppend = "\r\n Happy Ending !!"; //new line in content
	    Path path = Paths.get("C:\\Users\\Lenovo\\test.txt");
	    Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
	}
	break;
	default:System.out.println("Invalid operation");
}
}
}