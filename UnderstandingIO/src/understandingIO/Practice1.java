package understandingIO;

import java.io.*;
import java.text.NumberFormat;

public class Practice1 
{

	
	public static void main(String[] args) 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		BufferedReader in = getReader("movies.txt");
		
		Movie movie = readMovie(in);
		
		while (movie!= null)
		{
			String message = Integer.toString(movie.year);
			message += ":" + movie.title;
			message += "(" + nf.format(movie.price) + ")";
			System.out.println(message);
			movie = readMovie(in);
		}

	}

}
