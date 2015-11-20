
	//A program that creates a picture of a smiley face on JFrame. All but one line is from pages 192 and 193 of Java: How To Program
	// by Paul and Harvey Deitel.

import java.awt.Color;									//Gets the Java color package.
import java.awt.Graphics;								//Gets the Java graphics package.
import javax.swing.JFrame;								//Gets the Java JFrame package.
import javax.swing.JPanel;								//Gets the Java JPanel package.

	public class Face_1 extends JPanel					//Declaring a class that extends JPanel?
	{
		public void paintComponent(Graphics g) 			//Declaring a method
		{
			super.paintComponent(g);					//Initializing 
														
			g.setColor(Color.YELLOW);					//Method that sets the color to yellow.
			g.fillOval(50,  10, 200,  240);				//Draws the face.
			g.setColor(Color.BLACK);					//Method that sets the color to black.
			
			g.fillOval(90, 65 , 30, 30);				//Draws an eye.
			g.fillOval(170,  65,  30,  30);				//Draws the other eye.
			
			
			g.fillOval(80,  110,  120,  80);			//Draws the mouth.
			
			g.setColor(Color.YELLOW);					//Method that sets the color to yellow.
			
			g.fillRect(80,  110,  120,  30);			//Draws a rectangle to shape the mouth.
			g.fillOval(80,  120,  120,  40);			//Draws an oval to fine tune the smile.

		}
	public static void main(String[] args)
	{
		Face_1 panel = new Face_1();									//Initializes Face_1.
		JFrame application = new JFrame("You Won!");					//Initializes the JFrame and includes text.
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Closes the JFrame.
		application.add(panel);											//Adds a panel.
		application.setSize(350, 350);									//Tells the size of the panel.
		application.setVisible(true);									//Makes the panel visible.

	}

}
