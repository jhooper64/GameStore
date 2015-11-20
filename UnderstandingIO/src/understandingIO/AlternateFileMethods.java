package understandingIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;


public class AlternateFileMethods {



	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		File outFile = new File("demoed.txt");
		FileOutputStream outFileStream;
		
		SecureRandom ran = new SecureRandom();
		
		int num = ran.nextInt(599);
		
		try 
		{
			
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			
			System.out.println("Greetings, demoee.  What is your name?");
			String name = scan.next();
			outStream.println("The demoee's name is " +name+ ".");
			
			System.out.println(name+", what is your age?");
			String age = scan.next();
			outStream.println("The demoee's age is " +age+ ".");
			
			System.out.println(name+", what is your address?");
			String add = scan.next();
			outStream.println("The demoee's SSN is " +add+ ".");
			
			System.out.println("Final inquery: what is your Social Security Number?");
			int SSN = scan.nextInt();
			outStream.println("The demoee's SSN is " +SSN+ ".");
			
			outStream.println("The demoee is designated Patient Number 000" +num+ ".");
			
			System.out.println("I will find you.");
			
			outStream.close();
			scan.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	
		
		
	}

}
