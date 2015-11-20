import java.security.SecureRandom;					//Gets the Java SecureRandom package.
import java.util.Scanner;							//Gets the Java utility scanner package.
import javax.swing.JOptionPane;						//Gets the Java JOptionPane package.
import java.awt.Color;								//Gets the Java color package.
import java.awt.Graphics;							//Gets the Java graphics package.
import javax.swing.JFrame;							//Gets the Java JFrame package.
import javax.swing.JPanel;							//Gets the Java JPanel package.

//A program that creates a guessing game using graphics.

public class Guess_Two 																//Main Class called Guess_Two 
{


	public static void main(String[] args) 											//Main method.
	{
		
		//Scanner input = new Scanner(System.in);										// Chapter 5, page 178 (Java class book). Variable declaration statement using the keyword "new" to create a scanner object that reads characters typed by the user.
		
		SecureRandom randomNumbers = new SecureRandom();							//Chapter 5, page 178 (Java class book). A declaration statement that generates a random number that cannot be predicted.
		
		String name = JOptionPane.showInputDialog(" Hello. What is your name? ");	//Chapter 2, page 61 (Java class book). Creating an input dialog box with a prompt and a string variable.
			
	    JOptionPane.showMessageDialog(null,"Welcome, "+ name +".");   				//Chapter 2, page 61 (Java class book). Using format to return a string that the user inputed and create another string variable.
		
	    JOptionPane.showMessageDialog(null, "Let's play a game! I will pick a number between 1 and 100 and you guess what it is. ");	//Chapter 2 page 60 (Java class book). The first part tells the program to put the dialog box in the center if it is null, then it prints the output into the dialog box.
	    
	    String ContinueGame = null;													//Declaring and initializing the string variable ContinueGame.
	    
	   	    	    	    
	    do													//The beginning of a do/while loop.
	    {													//The beginning of the do/while block.
	    		
		
		int randomValue = randomNumbers.nextInt(101);		//Chapter 5, page 178 (Java class book). Creating an integer variable and tells the number generator to go up to the number 100.
		
		int Num1;											//Declaring an integer variable Num1.		
		int NumCounter = 1;									//Declaring an integer variable NumCounter (the counter).
		
		JOptionPane.showMessageDialog(null, "One moment please.");		//An output statement for the user.
		
		try{Thread.sleep(3000);}	//Given in class by Professor Marshall. Puts a thread into a timed waiting state for a specified amount of time (try block contains the code that might throw an exception).
		catch (Exception e){}		//Given in class by Professor Marshall. (Catch block contains the code that handles an exception, if it occurs)
			
			
		String string;												//Declaring a String called string.
		
		
		string = JOptionPane.showInputDialog("Guess a number:  ");	//An output statement that displays the statement to the user on the next line.			
		Num1 = Integer.parseInt(string);							//Converts the string into an integer for Num1.
			
		
		
		while (Num1 != randomValue)			//A while loop that enables the program to perform the following statements repeatedly as long as the condition is met.
		{									//Begins the while loop block of code.
			++NumCounter;					//The counter will count each time the user guesses and it adds by 1.
			
			
				if (Num1 < randomValue)											//Another if statement that says if this condition is true, do the following.
				{																//Begins the if statement.
					
					Drawing1.main();											//(Professor Marshall) Passing both a class and a method.
									
					
				}																//Ends the if statement block.
				else															//An else statement that occurs if the if statement is not met.
					
					Drawing2.main();											//(Professor Marshall) Passing both a class and a method.
			
			string = JOptionPane.showInputDialog("Guess a number:  ");	//Same output statement as above.			
			Num1 = Integer.parseInt(string);							//Converts the string into an integer for Num1.
			
			
		}									//End of the while loop.
			if (Num1 == randomValue)		//An if statement that says if the number that the user guesses (Num1) equals the random number, then it prints out the following statements.
			{								//Begins the if statement block.
											
				Face_1.main();				//Passing both a class and a method.
				
				JOptionPane.showMessageDialog(null, "It took you " + NumCounter + " tries.");		//An output statement that informs the user to how many tries it took.
				
						
				}											//End of the if statement block.
			
			ContinueGame = JOptionPane.showInputDialog("Would you like to play again (y/n) ?");	//Gives the user a choice to continue.
				
			
	    }													//The end of the do/while block.
		while (ContinueGame.equals("y")); 					//A while loop that will continue the game so long as the user enters "Y".   	
	   
	    JOptionPane.showMessageDialog(null, "Goodbye!");	//An output statement that displays when the user enters "N".
	        
	}
	
	//A program that creates an upward arrow. The idea of a rectangle came from page 153 of Java: How To Program by Paul and Harvey Deitel.
	
	public static class Drawing1 extends JPanel				//Declaring a class called Drawing1 that extends JPanel?
	{

					
		public void paintComponent(Graphics g) 										//Declaring a method
		{
			super.paintComponent(g);												//Initializing g.
														
			g.setColor(Color.ORANGE);												//Method that sets the color to orange.
			g.fillRect(100, 120, 120,  140);										//Draws the rectangle part of the arrow.
			g.fillPolygon(new int[]{70, 165, 250}, new int[]{120, 40, 120}, 3);		//Draws the triangle part of the arrow.
								
		}
			
		public static void main() 											//A main method.
		{
			Drawing1 panel = new Drawing1();								//Initializes the Drawing1.
			JFrame application = new JFrame("Higher");						//Initializes the JFrame.
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Closes the JFrame.
			application.add(panel);											//Adds a panel.
			application.setSize(350, 350);									//Tells the size of the panel.
			application.setVisible(true);									//Makes the graphic and panel visible to the user.
			
		}

	}
	
	//A program that makes a downward arrow. The idea of a downward triangle came from page 571 in Java: How to Program by Paul and Harvey Deitel.
	
	public static class Drawing2 extends JPanel			//Declaring a class called Drawing2 that extends JPanel.
	{
							
		public void paintComponent(Graphics g) 			//Declaring a method
		{
			super.paintComponent(g);					//Initializing 
														
			g.setColor(Color.ORANGE);					//Method that sets the color to orange.
			g.fillRect(100, 60, 130, 120);				//Draws the rectangle part of the arrow.
			
	
		    g.fillPolygon(new int[]{60, 160, 270}, new int[]{180, 290, 180}, 3);	//Draws the triangle part of the arrow.
						
		}
		
		public static void main() 											//A main method.
		{
			Drawing2 panel = new Drawing2();								//Initializes the Drawing1.
			JFrame application = new JFrame("Lower");						//Initializes the JFrame.
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Closes the JFrame.
			application.add(panel);											//Adds a panel.
			application.setSize(350, 350);									//Tells the size of the panel.
			application.setVisible(true);									//Makes the graphic and panel visible to the user.
	}

}
	//Making a Happy Face. Most of the program came from pages 192 and 193 of Java: How To Program by Paul and Harvey Deitel.
	
	public static class Face_1 extends JPanel			//Declaring a class that extends JPanel?
	{
		
		public void paintComponent(Graphics g) 			//Declaring a method
		{
			super.paintComponent(g);					//Initializing g
														
			g.setColor(Color.YELLOW);					//Method that sets the color to yellow.
			g.fillOval(50,  10, 200,  240);				//Draws the face.
			g.setColor(Color.BLACK);					//Method that sets the color to black.
			g.fillOval(90, 65 , 30, 30);				//Draws an eye.
			g.fillOval(170,  65,  30,  30);				//Draws the other eye.
			//g.fillOval(65,  140, 50,  50);			//Draws the tongue.
			
			g.fillOval(80,  110,  120,  80);			//Draws the mouth.
			
			g.setColor(Color.YELLOW);					//Method that sets the color to yellow.
			g.fillRect(80,  110,  120,  30);			//Draws a rectangle to shape the mouth.
			g.fillOval(80,  120,  120,  40);			//Draws an oval to fine tune the smile.

			
		}
		
		
	public static void main()											//Declaring a method
	{
		Face_1 panel = new Face_1();									//Initializes Smiles.
		JFrame application = new JFrame("You Won!");					//Initializes the JFrame.
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Closes the JFrame.
		application.add(panel);											//Adds a panel.
		application.setSize(350, 350);									//Tells the size of the panel.
		application.setVisible(true);									//Makes the panel visible.

	}

  }

}




