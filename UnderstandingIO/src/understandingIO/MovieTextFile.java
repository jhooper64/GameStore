//Code from pages 647 & 648 in Java: How To Program by Paul & Harvey Deitel.


package understandingIO;

import java.io.File; 
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

//import movieList.MovieList.Movie;

public class MovieTextFile 
{
	private static Scanner input;
	
	public static void main(String[] args) 
	{
		openFile();
		readRecords();
		closeFile();
	}
	public static void openFile()
	{
		try 
		{
			input = new Scanner(Paths.get("MoviesList.txt"));
		}
		catch (IOException ioException)
		{
			System.err.println("Error opening File.class Terminating.");
			System.exit(1);
		}
	}
	public static void readRecords()
	{
		System.out.println(" Title " + " Year " + " Genre ");
		
		try
		{
			while (input.hasNext())
			{
				System.out.printf(input.next(), input.nextInt(), input.next());
			}
		}
		
		
		catch (NoSuchElementException elementException)
		{
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException)
		{
			System.err.println("Error reading from file. Terminating.");
		}
	}
	//private static Movie[] getMovies()
	//{
	
	//Movie[]movies = new Movie[12];
	
	//movies[0] = new Movie("John Carpenter's The Thing", "1982", "Sci-Fi Horror");
	//movies[1] = new Movie("Stargate", "1994", "Sci-Fi");
	//movies[2] = new Movie("Comedy of Terrors", "1963", "Comedy Horror");
	//movies[3] = new Movie("Jurassic Park", "1993", "Adventure Sci-Fi");
	//movies[4] = new Movie("Adventures of Robin Hood", "1938", "Action Adventure");
	//movies[5] = new Movie("Libeled Lady", "1936", "Comedy Romance");
	//movies[6] = new Movie("Them!", "1954", "Horror Sci-Fi");
	//movies[7] = new Movie("Ghostbusters", "1984", "Comedy Fantasy");
	//movies[8] = new Movie("My Man Godfrey", "1936", "Romance Comedy");
	//movies[9] = new Movie("The General", "1926", "Adventure Comedy");
	//movies[10] = new Movie("Aliens", "1986", "Action Sci-Fi");
	//movies[11] = new Movie("Shaun of the Dead", "2004", "Comedy Horror");
	
	
	//return movies;
	//}
	
	
	public static void closeFile()
	{
		if (input != null)
			input.close();
	}

}
