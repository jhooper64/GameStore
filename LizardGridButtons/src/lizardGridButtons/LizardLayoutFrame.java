package lizardGridButtons;

//From Java: How to Program (525) by Paul & Harvey Deitel.




import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;





public class LizardLayoutFrame extends JFrame
{
	public Graphics getGraphics1()
	{ 				// create method to hold a jFrame containing the witch picture
		JPanel SnappingTurtle = new JPanel(); 				// creates a new JPanel
		LizardLayoutFrame pic = new LizardLayoutFrame();
		
		
		// show the image
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pic.setSize(600, 450);
		
		final JLabel label1; // JLabel with text and Icon		
		Icon snappingTurtle = new ImageIcon(getClass().getResource("SNAPPER.JPG"));
		label1 = new JLabel(); // JLabel constructor no arguments
		label1.setText("SnappingTurtle");
		label1.setIcon(snappingTurtle); // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		SnappingTurtle.add(label1);// add label1 to JFrame	
		pic.add(SnappingTurtle);
		pic.setVisible(true);	
		return null;
	}
			// create a method for the jFrame containing treasure
		public Graphics getGraphics2()
		{ 		
			JPanel PaintedTurtle = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label2; 		// JLabel with text and Icon
			Icon paintedTurtle = new ImageIcon(getClass().getResource("PTurtle.jpg"));
			label2 = new JLabel();		 // JLabel constructor no arguments
			label2.setText("Painted Turtle");
			label2.setIcon(paintedTurtle);			 // add icon to JLabel
			label2.setHorizontalTextPosition(SwingConstants.CENTER);
			label2.setVerticalTextPosition(SwingConstants.BOTTOM);
			PaintedTurtle.add(label2); 		// add label to JFrame
			pic.add(PaintedTurtle);
			pic.setVisible(true);
			return null;
		}
			// create a method for jFrame containing troll
		public Graphics getGraphics3()
		{ 		
			JPanel SpinyTurtle = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon spinyTurtle = new ImageIcon(getClass().getResource("SpinySoftshell.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Spiny Softshell Turtle");
			label3.setIcon(spinyTurtle); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			SpinyTurtle.add(label3); // add label to JFrame
			pic.add(SpinyTurtle);
			pic.setVisible(true);
			return null;
		}
		
		public Graphics getGraphics4()
		{ 		
			JPanel NorthernAlligatorLizard = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon northernAlligatorLizard = new ImageIcon(getClass().getResource("Northern_alligator_lizard.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Northern Alligator Lizard");
			label3.setIcon(northernAlligatorLizard); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			NorthernAlligatorLizard.add(label3); // add label to JFrame
			pic.add(NorthernAlligatorLizard);
			pic.setVisible(true);
			return null;
		}
		
		public Graphics getGraphics5()
		{ 		
			JPanel GreaterShortHornedLizard  = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon greaterShortHornedLizard = new ImageIcon(getClass().getResource("9328591769_9c1c725552.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Greater Short-horned Lizard");
			label3.setIcon(greaterShortHornedLizard); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			GreaterShortHornedLizard.add(label3); // add label to JFrame
			pic.add(GreaterShortHornedLizard);
			pic.setVisible(true);
			return null;
		}
		
		

		public Graphics getGraphics6()
		{ 		
			JPanel CommonSagebrushLizard  = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon commonSagebrushLizard = new ImageIcon(getClass().getResource("SCEGRA-M-08b.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Common Sagebrush Lizard");
			label3.setIcon(commonSagebrushLizard); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			CommonSagebrushLizard.add(label3); // add label to JFrame
			pic.add(CommonSagebrushLizard);
			pic.setVisible(true);
			return null;
		}
		
		public Graphics getGraphics7()
		{ 		
			JPanel WesternFenceLizard  = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon westernFenceLizard = new ImageIcon(getClass().getResource("WesternFenceLizard.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Western Fence Lizard");
			label3.setIcon(westernFenceLizard); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			WesternFenceLizard.add(label3); // add label to JFrame
			pic.add(WesternFenceLizard);
			pic.setVisible(true);
			return null;
		}
		
		public Graphics getGraphics8()
		{ 		
			JPanel WesternSkink  = new JPanel();
			LizardLayoutFrame pic = new LizardLayoutFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(700, 550);
			
			final JLabel label3; // JLabel with text and Icon
			Icon westernSkink = new ImageIcon(getClass().getResource("SkiltonsSkinkbyGaryNafis.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("Greater Short-horned Lizard");
			label3.setIcon(westernSkink); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			WesternSkink.add(label3); // add label to JFrame
			pic.add(WesternSkink);
			pic.setVisible(true);
			return null;
		}
		


}
