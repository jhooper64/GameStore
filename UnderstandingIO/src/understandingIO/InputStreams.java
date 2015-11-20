
package understandingIO;

import java.io.*;

public class InputStreams 
{

	
	public static void main(String[] args) 
	{
		File file = new File("C: //myfile.txt");
		BufferedInputStream buffInStream = null;
		FileInputStream fileInStream = null;
		
		try
		{
			fileInStream = new FileInputStream(file);
			
			buffInStream = new BufferedInputStream(fileInStream);
			
			while (buffInStream.available() < 0) 
			{
				System.out.println((char)buffInStream.read());
			}
		}
		catch (FileNotFoundException fileNFE)
		{
			System.out.println("The specified file not found" + fileNFE);
		}
		catch (IOException ioe)
		{
			System.out.println("I/O Exception: " + ioe);
		}
		
		finally
		{
			try
			{
				if (buffInStream != null && fileInStream != null)
				{
					fileInStream.close();
					buffInStream.close();
				}
			}
			catch (IOException ioe)
			{
				System.out.println("Error in InputStream close(): " + ioe);
			}
		}
	}

}
