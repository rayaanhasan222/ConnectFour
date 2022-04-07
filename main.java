import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class main extends JFrame
{
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	
//   public static void main(String[] args) {
//      JFrame frame = new JFrame();
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setPreferredSize(new Dimension(800, 600));
//      frame.getContentPane().setBackground(Color.BLUE);
//      frame.pack();
//      frame.setVisible(true);
	public main()
	{
		final Color DEFAULT_COLOR = Color.GRAY;
		//getContentPane().add(new board());
		 List<ShapeItem> shapes = new ArrayList<ShapeItem>();
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 220, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 330, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 440, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 550,100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 550, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 660, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(110, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(220, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(330, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(440, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(550, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(660, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 1, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        shapes.add(new ShapeItem(new Ellipse2D.Double(1, 110, 100, 100),
	                DEFAULT_COLOR));
	        
		setSize(WIDTH,HEIGHT);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      JFrame frame = new JFrame();
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setPreferredSize(new Dimension(800, 800));
		      ShapesPanel panel = new ShapesPanel(shapes);
		      panel.setBackground(Color.BLUE);
		      frame.add(panel);
		      //frame.getContentPane().add(new chips() );
		      frame.pack();
		      frame.setVisible(true);
		      
		      
				JFrame frame1 = new JFrame("instructions");
				final JTextArea tf = new JTextArea();
				tf.setBounds(50,50,1000,200);
				JButton b = new JButton("Click Here to Read Instructions");
				b.setBounds(50,300,295,30);
				b.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent arg0) 
							{
								String instruc[] = {
										"The rules are simple!", 
										"Try to build a row of four checkers while keeping your opponent from doing the same.",
										"",
										"OBJECT:", 
										"Be the first player to get four of your colored checkers in a row-", 
										"vertically, horizontally, or diagonally!"
										};
								 for (int s=0; s<instruc.length; s++)
								 {
									 tf.append(instruc[s]);
									 tf.append("\n");
								 }
							
								

//								tf.setText("CONNECT FOUR!!");
							}
					
						});
				frame1.add(b);
				frame1.add(tf);
				frame1.setSize(800,800);
				frame1.setLayout(null);
				frame1.setVisible(true);
		      
	}


	public static void main( String args[] )
	{
		main run = new main();
	}
}
