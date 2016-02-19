package gameStore;

import javax.swing.JOptionPane;
import java.security.SecureRandom;	
import java.util.InputMismatchException;


public class PlatformPlayStation extends GameSuperStore
{
	PlatformPlayStation station = new GameMainStore().new PlatformPlayStation();
	
	
	private static String familyname;
	private static String adventurename;
	private static String actionname;
	private static String rpgname;
	private static double pfamilycost;
	private static double padventurecost;
	private static double pactioncost;
	private static double prpgcost;
	private static int choice;
	private static double cost;
	private static double shipping = 5;
	private static boolean continueLoop = true;
	
	
	public static void myPlayStation()
	{
			
		familyname = "Little Big Planet 3";
		pfamilycost = 34.99;
		adventurename = "UNCHARTED: The Nathan Drake Collection";
		padventurecost = 29.99;
		actionname = "The Last of Us";
		pactioncost = 19.99;
		rpgname = "The Elder Scrolls V: Skyrim Legendary Edition";
		prpgcost = 17.99;
		
		//@Override
	
		//PlatformPlayStation playstation1 = new PlatformPlayStation();
	
		PlatformPlayStation[] playstation = new PlatformPlayStation[0];
				
		playstation[0].getfamilyname();
		
		playstation[1].getadventurename();
		
		playstation[2].getactionname();
		
		playstation[3].getrpgname();
	
				
		do	
		{	
			
			String string = JOptionPane.showInputDialog("Choose a game from the following list by number: 1. Family " + playstation[0] + pfamilycost + " 2. Adventure  " + playstation[1] + padventurecost + " 3. Action  " + playstation[2] + pactioncost + " 4. RPG  " + playstation[3] + prpgcost);	
			choice = Integer.parseInt(string);			//Converting a string into an integer.
	
			if (choice == 1)
			{
				cost = pfamilycost;
			}
			else if (choice == 2)
			{
				cost = padventurecost;
			}
			else if (choice == 3)
			{
				cost = pactioncost;
			}
			else if (choice == 4)
			{
				cost = prpgcost;
			}
	
			//SecureRandom randomNumbers = new SecureRandom();
			//int randomValue = randomNumbers.nextInt(1001);
	
			cost = pfamilycost + padventurecost + pactioncost + prpgcost + shipping;
			
			try
			{
				String answer = JOptionPane.showInputDialog(null, "You chose: " + choice + " Do you wish to continue shopping (Y/N)? ");
			}
			catch(InputMismatchException exception)
			{
				JOptionPane.showMessageDialog(null, "Incorrect input. Please try again.");
			}
			if (answer.equalsIgnoreCase("Y"))				//Ignore case for the Y or N answer.
			{
				continueLoop = true;
			}
			else if (answer.equalsIgnoreCase("N"));
			{
				checkOut();								//Suggested by Jerico.
			}
			
			
		}
	
		while (choice > 4);
		{
			JOptionPane.showMessageDialog(null, "You entered an invalid number. Try again.");
		}
	}
	
	public static void checkOut()
	{
	try
	{
	JOptionPane.showInputDialog(null, "Your total is: " + cost + " This includes a shipping charge of $5");
		
	}
	catch(InputMismatchException e)
	{
		JOptionPane.showMessageDialog(null, "Incorrect input. Please try again.");
	}
	}
}
