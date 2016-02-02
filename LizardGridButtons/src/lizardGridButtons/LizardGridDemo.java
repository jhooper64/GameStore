package lizardGridButtons;

//From the Java: How to Program book (528 & 529) by Paul & Harvey Deitel.


import javax.swing.JFrame;


public class LizardGridDemo 
{
	public static void main(String[] args) 
	{
		LizardGrid lizardGrid = new LizardGrid();
		lizardGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lizardGrid.setSize(400, 300);
		lizardGrid.setVisible(true);

	}
}
