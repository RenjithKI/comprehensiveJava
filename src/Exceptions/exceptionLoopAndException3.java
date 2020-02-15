package Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionLoopAndException3 {

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
		
		String[] stArr;
		// read lines from the file until no lines are left
		for  (int i =0; i < 5; i++){
			try {
				String oneLine = inputFile.nextLine();				
				//if (i ==2) 
					//{throw new Exception();}				
				System.out.println("line > "+ oneLine);
				
				stArr = oneLine.split(" ");
				System.out.println(">>>>..."+stArr.length);
				System.out.println(">>>>..."+stArr[stArr.length-1]);
			} catch (Exception e) {
				System.out.println(">>...");
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
		inputFile.close();// close the file
		

	}

}
