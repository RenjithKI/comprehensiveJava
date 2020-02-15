package Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionLoop2 {

	public static void main(String[] args) { 
		// create a Scanner object for the keyboard
		Scanner scanner = new Scanner(System.in);		
		//get the name of the file 
		System.out.println("enter the file name : ...");
		String filename = scanner.nextLine();
		// above for file name entry by user
		
		
		// open the file 
		Scanner inputFile = null;
		FileInputStream file = null;
		try{
			file = new FileInputStream(filename);
		} catch(FileNotFoundException e) {
			System.out.println("exception thrown...");
			e.printStackTrace();
		}
		
		//***********************
		inputFile = new Scanner(file);
		
		// read lines from the file until no lines are left
		while (inputFile.hasNext()){
			String oneLine = inputFile.nextLine();
			System.out.println("line > "+ oneLine);
		}
		inputFile.close();// close the file
		

	}

}
