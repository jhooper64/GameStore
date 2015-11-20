

import java.awt.Color;								//Gets the Java color package.
import java.awt.Graphics;							//Gets the Java graphics package.
import javax.swing.JFrame;							//Gets the Java JFrame package.
import javax.swing.JPanel;							//Gets the Java JPanel package.

	public class Drawing2 extends JPanel
	{

					//Declaring a class that extends JPanel?
		public void paintComponent(Graphics g) 			//Declaring a method
		{
			super.paintComponent(g);					//Initializing 
														
			g.setColor(Color.ORANGE);					//Method that sets the color to yellow.
			g.fillRect(100, 60, 130, 120);				//Draws the face.
			
	
		    g.fillPolygon(new int[]{60, 160, 270}, new int[]{180, 290, 180}, 3);
			
			
		}
		
		public static void main(String[] args) 
		{
			Drawing2 panel = new Drawing2();				//Initializes the Drawing1.
			JFrame application = new JFrame("Lower Than");			//Initializes the JFrame.
			
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Closes the JFrame.
			application.add(panel);											//Adds a panel.
			application.setSize(350, 350);									//Tells the size of the panel.
			application.setVisible(true);	
	}

}
