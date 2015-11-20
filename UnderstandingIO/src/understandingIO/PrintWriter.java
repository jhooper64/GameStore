package understandingIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;



public class PrintWriter 
{


	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		File file = new File("Writer.txt");
		FileOutputStream outputFileStream;
		
		int num = ran.Int(599);
		
		try
		{
			outputFileStream = new FileOutputStream(file);
			PrintWriter outputStream = new PrintWriter(outFileStream);
			
			System.out.println("What day is it?");
			String day = scan.next();
			outputStream.println("It is " + day );
			
			
			outputStream.close();
			scan.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
