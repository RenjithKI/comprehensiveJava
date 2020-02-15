package Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionLoopAndException4 {

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
//			try {
				String oneLine = inputFile.nextLine();				
				if (i ==3) throw new Exception();
				
				System.out.println("line > "+ oneLine);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		inputFile.close();// close the file
		

	}

}
