import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class chips extends Canvas implements MouseListener
{
	private int x;
	private int y;
	final int ALL = 64;
	int [] xx = new int [ALL];
	int [] yy = new int [ALL];
	int numCircles = 0;
	
	public chips ()
	{
		
		addMouseListener(this);
	}
	
	public void drawCircle(int x, int y)
	{
		
		Graphics g = this.getGraphics();
//		g.drawOval(x, y,90, 90);
		g.setColor(Color.YELLOW);
		for (int i = 0; i < numCircles; i++)
		{
			g.fillOval(xx[i], yy[i], 90, 90);
		}
		g.fillOval(x,y,90,90);
		
//		Graphics g = this.getGraphics();
//		g.drawOval(x, y,90, 90);
//		
//		boolean col = true;
//		int change = 0;
//		while (col = true)
//		{
//			if (change % 2 == 0)
//			{
//				g.setColor(Color.YELLOW);
//				g.fillOval(x,y,90,90);
//			}
//			if (change % 2 == 1)
//			{
//				g.setColor(Color.RED);
//				g.fillOval(x,y,90,90);
//			}
//			change += 11;
//			
//		}

	}
	public void mouseClicked(MouseEvent e) 
	{
		if (numCircles < ALL)
		{
			xx[numCircles] = e.getX();
			yy[numCircles] = e.getY();
			numCircles++;
			
		}
//		x = e.getX();
//		y = e.getY();
//		System.out.println(x + " " + y);
//		System.out.println("i = " + (y/90) + " j = " + (x/90));
		
		repaint();
		
		
	}
	
	public void paint(Graphics g)
	{
		int x1 = 10;
		int y1=10;
		for(int x = 10; x<810;x+=100) {
			for(int y = 10; y<810;y+=100) {
				g.drawOval(x,y,90,90);
			}
		}
		g.setColor(Color.GRAY);
		for(int x = 10; x<810;x+=100) {
			for(int y = 10; y<810;y+=100) {
				g.fillOval(x,y,90,90);
			}
		}
		drawCircle(x,y);
	}
	
	/*public void paint1( Graphics window ) 
	{
//		window.setColor(Color.WHITE);
		int x1 = 10;
		int y1=10;
		for(int x = 10; x<810;x+=100) {
			for(int y = 10; y<810;y+=100) {
				window.drawOval(x,y,90,90);
			}
		}
		window.setColor(Color.GRAY);
		for(int x = 10; x<810;x+=100) {
			for(int y = 10; y<810;y+=100) {
				window.fillOval(x,y,90,90);
			}
		}
	}*/
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}
	
	
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   chips frame = new chips();
                   frame.setVisible(true);
              }
        });
    }

}