package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionLoopAndNested {
	
	static void method1(Scanner inputFile){
		// read lines from the file until no lines are left
				for  (int i =0; i < 15; i++){
					method22(inputFile, i);	
				}
	}
	
	static void method22(Scanner inputFile, int i){
		try {
			String oneLine = method33(inputFile, i);
			
			System.out.println("line > "+ oneLine);
		} catch (Exception e) {
			// TODO Auto-generated catch block  
			System.out.println("i am cought here");
			e.printStackTrace();
		}
	}
	
	static String method33(Scanner inputFile, int i) throws Exception{
		String oneLine = inputFile.nextLine();				
		if (i ==2) throw new Exception();
		return oneLine;
	}
	

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
		
		method1(inputFile);
		
		
		inputFile.close();// close the file
		

	}

}
