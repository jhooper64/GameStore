//A program that gets the average, adds two decimal numbers, displays the date and time, the use of a mod to determine if the average number is even or odd, and uses JOptionPane input and output dialog windows.
//Java: How to Program by Paul and Harvey Deitel.

import java.util.Date;				//Imports the clock so the program can display the date and time when it is used.
import java.util.Scanner; 			//Importing the scanner which allows input from the user to be translated and read by the computer.
import javax.swing.JOptionPane;		//Importing JOptionPane to create a dialog box.




public class Average 				//Declaring the class.
{									//Begins the class body.
	
	
	public static void main(String[] args) //Declaring the main method.
	{
	

		Date date = new Date();		//Variable declaration statement using the keyword "date" to create a date object that allows the clock to run.
		
		System.out.println(date.toString());	//Displays the clock and date to the user.
		
		Scanner input = new Scanner(System.in);	// Chapter 5, page 178 (Java class book). Variable declaration statement using the keyword "new" to create a scanner object that reads characters typed by the user.
		
		int Sum = 0;							//Declaring an integer variable Sum.
		int Avg = 0;							//Declaring an integer variable Avg.
		int Num;								//Declaring an integer variable Num.
		float Sumfl = 0;						//Declaring a float variable Sumfl.
		
		String name = JOptionPane.showInputDialog("What is your name? ");	//Chapter 2, page 61 (Java class book). Creating an dialog box with a prompt and a string variable.
		 
		
		
		String message = String.format("Please wait %s", name);	//Chapter 2, page 61 (Java class book). Using format to return a string that the user inputed and create another string variable.
		
		System.out.println(message);			//Typed in by Delanie, the tutor. Prints the output "message" on the screen for the user.
		
		
		
		try{Thread.sleep(3000);}	//Given in class by Professor Marshall. Puts a thread into a timed waiting state for a specified amount of time (try block contains the code that might throw an exception).
		catch (Exception e){}		//Given in class by Professor Marshall. (Catch block contains the code that handles an exception, if it occurs)
		
		System.out.println("\nHow many numbers do you want to get the average? ");	//From www.java.achchuthan.org. An output statement asking the user to input the amount of number he/she want to average.
		Num = input.nextInt();														//Converts the input into an integer to use later.
		
		int [] array = new int[Num];											//From the class book chapter 6.5 on page 214. Creating an array that will hold the numbers inputed by the user to be used for getting the average.
		
		System.out.println("Please enter the numbers to get an average: ");		//An output statement asking the user to input the numbers to be calculated for the average.
		
		for (int count = 0; count < Num; count++)								//From the class book chapter 4 page 124. A for loop used to count the numbers inputed by the user so it will not exceed the amount specified for the array.
		{
			
			array[count] = input.nextInt();					//From the class book chapter 6.5 on page 215. The count in the for loop being incorporated into the array. The array will hold the input numbers from the user.
			Sum = Sum + array[count];						//The math formula that adds the numbers stored in the array.
		}
		System.out.println("The sum is: " + Sum);			//An output statement that shows the sum of the numbers given by the user. 
		
		Avg = Sum / Num;									//The math formula for getting the average.
		System.out.println("The average is: " + Avg);		//The output statement that displays the average to the user.

		if (Avg % 2 == 0)											//An if statement that uses a mod to determine if the average is an even number.
		{
			System.out.println("The average is an even number. ");	//If the average is even, this output statement declares it to the user.
		}
		else														//An else statement that is used to deal with an average that is an odd number.
		{
			System.out.println("The average is an odd number. ");	//IF the average is odd, this output statement declares it to the user.
		
		}
		
		try{Thread.sleep(3000);}	//Given in class by Professor Marshall. Puts a thread into a timed waiting state for a specified amount of time (try block contains the code that might throw an exception).
		catch (Exception e){}		//Given in class by Professor Marshall. (Catch block contains the code that handles an exception, if it occurs)
		
		
		float fl = 398.7f;						//Found on www.homeandlearn.co.uk. Assigning a number to float while declaring a float variable.
		float flt =  674.2f;					//Found on www.homeandlearn.co.uk. Assigning a number to float while declaring a float variable.
		
		Sumfl = fl + flt;						//The math formula that adds the float numbers together.
		
		System.out.println("\nThe sum of " + fl + " plus " + flt + " equals: "+ Sumfl);	//Displays the float numbers and the sum to the user.
		
			
	}
	
}

	

