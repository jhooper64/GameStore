package gameStore;

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;


public class GameMainStore 
{


	public static void main(String[] args) 
	{
		GameSuperStore myGameStore = new GameSuperStore();
		
		String storename = myGameStore.getStoreName();
		
		String familyname = myGameStore.getfamilyname();
		String adventurename = myGameStore.getadventurename();
		String actionname = myGameStore.getactionname();
		String rpgname = myGameStore.getrpgname();
		
		JOptionPane.showMessageDialog(null, "Welcome to " + storename);
		
		String answer = JOptionPane.showInputDialog(null, "Choose a platform to get to the game list (1 = PlayStation, 2 = XBox)");
		
		
		if (answer.equals(1));				//Ignore case.
		{
			//PlatformPlayStation playstation1 = new PlatformPlayStation();
			
			PlatformPlayStation.myPlayStation();
			
			//Class2.doSomething();
			
		}
	    if (answer.equals(2));
		{
			PlatformXBox xbox = new PlatformXBox();
		}
		//want two buttons here to choose between the platforms
		
	}

}







