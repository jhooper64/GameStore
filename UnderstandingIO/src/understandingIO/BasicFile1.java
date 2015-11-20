
package understandingIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicFile1 
{

	
	public static void main(String[] args) 
	{
		File file = new File("read.txt");
		
		try
		{
			
		PrintWriter output = new PrintWriter(file);
		output.println("John Doe");
		output.println(32);
		output.close();
		}
		catch (IOException ioe)
		{
			System.out.println("Error: ");
		}
	}

}
