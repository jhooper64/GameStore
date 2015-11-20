//A program that assigns a suffix to the end of a number chosen by the user. It also gives the user a choice whether to continue.


import java.util.Scanner;								//Imports the scanner which allows input from the user.
import javax.swing.JOptionPane;							//Imports the JOptionPane to create a dialog box.
import javax.swing.JFrame;								//Imports the JFrame to allow drawing.

public class Placing_Num								//Declaring a class (in this case, Placing_Num).
{

	public static void main(String[] args)				//Declaring the Main method in the program.
	{
		int Num;										//Creating (declaring)an integer variable Num.
		int LastDigit1;									//Declaring an integer variable called LastDigit1.
		int LastDigit2;									//Declaring an integer variable called LastDigit2.
		String input2;									//Declaring a String variable called input2.
		String test = "yes";
		
		Scanner input = new Scanner(System.in);			//A variable declaration statement using the keyword "new" to create a scanner object that reads characters typed by the user.
		
		System.out.println("Please enter a number (without decimals) between 1 and 1000. ");	//An output statement prompting the user to type in a number.
		Num = input.nextInt();							//Converts the input into an integer to use later in the program.

							//Another math formula statement using a Mod to determine the next place of the number.
		boolean check = true;			//Classmate's help. A boolean to check to see if a statement is true.
		
			while (Num > 0 && Num < 1001)				//A while statement with an And operator.
			{
				do {									//Mr. Mashall's do/while loop. The beginning of a do/while statement that makes the program run first.
					LastDigit1 = Num% 10;							//A statement with a math formula using a Mod to determine the place of the number.
					LastDigit2 = (Num / 10) % 10;
					if (Num == 11 || Num == 12 || Num == 13)		//An if statement with Or operators.
					{
						System.out.println("\n" + Num + "th");		//An output statement that prints the suffix if the if statement criteria is met.
					}
					else if (LastDigit2 == 1)						//An else if statement checking the number of the 10's place.
					{
						System.out.println("\n" + Num + "th");		//An output statement that prints out the appropriate suffix.
					}
					else if (LastDigit1 == 1)						//An else if statement that checks the one's place for the number in question.
					{
						System.out.println("\n" + Num + "st");		//An output statement that prints out the appropriate suffix.
					}
					else if (LastDigit1 == 2)						//An else if statement that checks the one's place for the number in question.
					{
						System.out.println("\n" + Num + "nd");		//An output statement that prints out the appropriate suffix.
					}
					else if (LastDigit1 == 3)						//An else if statement that checks the one's place for the number in question.
					{
						System.out.println("\n" + Num + "rd");		//An output statement that prints out the appropriate suffix.
					}
					else 											//An else statement that refers to all other numbers.
					{
						System.out.println("\n" + Num + "th");		//An output statement that prints out the appropriate suffix.
					}
				
				System.out.println("Do you want to continue (yes/no)? ");		//Mr. Marshall's code. An output statement asking the user to continue.
				input2 = input.next();									//Mr. Marshall's code. Converts the user's input into input2 so it can be used later.
				if (input2.equals(test))								//Classmate's help.
				{
					check = false;										//Classmate's help.
				}
				//System.out.println("Working");							//A statement that was used to test areas of the program.
				
			}
				while (check); //while (input2.equals("yes"));								//Mr. Marshall's do/while loop. The end of the do/while statement which tells what to do if the answer is a yes.
				
				
				System.out.println("Please enter a number (without decimals) between 1 and 1000. ");
				Num = input.nextInt();				
				
			}
		}			
	}

