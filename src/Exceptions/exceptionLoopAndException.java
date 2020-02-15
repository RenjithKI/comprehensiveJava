package Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionLoopAndException {

	public static void main(String[] args) throws Exception {
		
		// open the file 
		Scanner inputFile = null;
		FileInputStream file = null;
		try{
			file = new FileInputStream("SampleFile.txt");
		} catch(FileNotFoundException e) {
			System.out.println("exception thrown...");
			e.printStackTrace();
		}
		
		//***********************
		inputFile = new Scanner(file);
		
		// read lines from the file until no lines are left
		for  (int i =0; i < 15; i++){
			try {
				String oneLine = inputFile.nextLine();
				System.out.println("line > "+ oneLine);
				if (i ==2) throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		inputFile.close();// close the file
		

	}

}
