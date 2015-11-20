package understandingIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;



public class PrintText
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		File file = new File("Print.txt");
		FileOutputStream outputFileStream;
		
		SecureRandom ran = new SecureRandom();
		
		int num = ran.nextInt(599);
		
		try 
		{
			outputFileStream = new FileOutputStream(file);
			PrintWriter outStream = new PrintWriter(outputFileStream);
			
			System.out.println("What day is it?");
			String day = scan.next();
			outStream.println("Today is " + day + ".");
			
			outStream.close();
			scan.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
