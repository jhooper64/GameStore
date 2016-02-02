package lizardGridButtons;

//From the book: Java: How to Program by Paul & Harvey Deitel (528 & 529).




import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class LizardGrid extends JFrame implements ActionListener 
{		
	
	private final JButton[] buttons; // create array of buttons
	private final String[] names = {"Snapping Turtle", "Painted Turtle", "Spiny Softshell", "Northern Alligator Lizard", "Greater Short-horned Lizard", "Common Sagebrush Lizard", "Western Fence Lizard", "Western Skink"};
	
	String[][][] reptilesLizards = 	
		       
		{{{"Snapping Turtle   ", "Painted Turtle   ", "Spiny Softshell   ", "Northern Alligator Lizard   ", "Greater Short-horned Lizard   ", "Common Sagebrush Lizard   ", "Western Fence Lizard   ", "Western Skink   "},
		{"Chelydra serpentina ", "Chrysemys picta   ", "Apalone spinifera   ", "Elgaria coerulea   ", "Phrynosoma hernandesi   ", "Sceloporus graciosus   ", "Sceloporus occidentalis   ", "Eumeces skiltonianus   "},
		{" Southeastern Region", "Throughout Montana  ", "Cenral & Southeastern Regions   ", "Northwestern Region   ", "Central & Eastern Regions   ", "Central Region   ", "Western Region   ", "Western Region   "}}};
	
	int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	
	
	
	private boolean toggle = true; 				// switches between the two layouts
	private final Container container;			// frame container
	private final GridLayout gridLayout1;		// first grid layout
	//private final GridLayout gridLayout2;		// second grid layout
	
	
	//Random random = new Random();			//Random number generator for the pictures.
	int Animal;
	int avg;
	double avg1;
	
	public LizardGrid()		//constructor with no arguments
	{
		super("Press Close Button To End");
		gridLayout1 = new GridLayout(3, 3, 5, 5); 	// grid layout has gaps of 5 between buttons
													// no gaps between buttons
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		
		for (int count = 0; count < names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);		// adds buttons to jframe
		}
	}
		// handle button events by toggling between the two layouts. Add event to each button selection
	@Override
	public void actionPerformed(ActionEvent event)
	{
		
		LizardArray lizardArray = new LizardArray();
		//int randomValue = random.nextInt(2);
															//SNAPPING TURTLE
		
		if (event.getSource() == buttons[0]) // if 1 is selected
			{
			JOptionPane.showMessageDialog(null, num[0] + " " + reptilesLizards[0][0][0] + reptilesLizards[0][1][0] + reptilesLizards[0][2][0]);
			
			avg = (8 + 14) /2;
			
			JOptionPane.showMessageDialog(null,  "Length: 8 to 14 inches   Average:  " + avg + " inches" );
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 0: {pic.getGraphics1(); break;}
			
			}
			}												//PAINTED TURTLE
		
		if (event.getSource() == buttons[1]) // if 2 is selected
			{
			JOptionPane.showMessageDialog(null, num[1] + " " + reptilesLizards[0][0][1] + reptilesLizards[0][1][1] + reptilesLizards[0][2][1]);
			
			avg1 = (3.2 + 7.1) /2;
			
			JOptionPane.showMessageDialog(null, "Length: 3.2 to 7.1 inches   Average: " + avg1 + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 1: {pic.getGraphics2(); break;}
			
			}
			}												//SPINY TURTLE
		
		if (event.getSource() == buttons[2]) // if 3 is selected
			{
			JOptionPane.showMessageDialog(null, num[2] + " " + reptilesLizards[0][0][2] + reptilesLizards[0][1][2] + reptilesLizards[0][2][2]);
			
			avg = (5 + 18) / 2;
			
			JOptionPane.showMessageDialog(null, "Length: 5 to 18 inches   Average: " + avg + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 2: {pic.getGraphics3(); break;}
			}
			}												//NORTHERN ALLIGATOR LIZARD
		
		if (event.getSource() == buttons[3]) // if 4 is selected
			{
			JOptionPane.showMessageDialog(null, num[3] + " " + reptilesLizards[0][0][3] + reptilesLizards[0][1][3] + reptilesLizards[0][2][3]);
			
			avg1 = (2.8 + 11.4) / 2;
			
			JOptionPane.showMessageDialog(null, "Length:  2.8 to 11.4 inches   Average: " + avg + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
						
			switch (Animal)
			{
			case 0: {pic.getGraphics4(); break;}
			}
			}												//GREATER SHORT-HORNED LIZARD
		
		if (event.getSource() == buttons[4]) // if 5 is selected
			{
			JOptionPane.showMessageDialog(null, num[4] + " " + reptilesLizards[0][0][4] + reptilesLizards[0][1][4] + reptilesLizards[0][2][4]);
			
			avg1 = (1.8 + 2.8) / 2;
			
			JOptionPane.showMessageDialog(null, "Length:  1.8 to 2.8 inches   Average: " + avg1 + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 0: {pic.getGraphics5(); break;}
			}
			}												//COMMON SAGEBRUSH LIZARD
		
		if (event.getSource() == buttons[5]) // if 6 is selected
			{
			JOptionPane.showMessageDialog(null, num[5] + " " + reptilesLizards[0][0][5] + reptilesLizards[0][1][5] + reptilesLizards[0][2][5]);
			
			avg1 = (1.9 + 5) / 2;
			
			JOptionPane.showMessageDialog(null, "Length:  1.9 to 5 inches   Average: " + avg1 + " inches");
			
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 0: {pic.getGraphics6(); break;}
			}
			}												//WESTERN FENCE LIZARD
		
		if (event.getSource() == buttons[6]) // if 7 is selected
			{
			JOptionPane.showMessageDialog(null, num[6] + " " + reptilesLizards[0][0][6] + reptilesLizards[0][1][6] + reptilesLizards[0][2][6]);
			
			avg1 = (2.5 + 7) / 2;
			
			JOptionPane.showMessageDialog(null, "Length:  2.5 to 7 inches   Average: " + avg1 + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 0: {pic.getGraphics7(); break;}
			}
			}												//WESTERN SKINK
		
		if (event.getSource() == buttons[7]) // if 8 is selected
			{
			JOptionPane.showMessageDialog(null, num[7] + " " + reptilesLizards[0][0][7] + reptilesLizards[0][1][7] + reptilesLizards[0][2][7]);
			
			avg1 = (2.1 + 7) / 2;
			
			JOptionPane.showMessageDialog(null, "Length:  2.1 to 7 inches   Average: " + avg1 + " inches");
			
			LizardLayoutFrame pic = new LizardLayoutFrame();
			
			switch (Animal)
			{
			case 0: {pic.getGraphics8(); break;}
			}
			}		
		
		/*if (event.getSource() == buttons[8]) // if 9 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 9!");
			//LabelFrame pic = new LabelFrame();
			
			}*/
		
		//SecureRandom randomNumber = new SecureRandom();
		//int randomValue = randomNumber.nextInt(buttons);
		// Set layout based on toggle
		
		if (toggle) 
		{
			//container.setLayout(gridLayout2);
		}
		else
		{
			container.setLayout(gridLayout1);
		}
		toggle =! toggle;
		container.validate();		// re-lay out container
		}
		





}
