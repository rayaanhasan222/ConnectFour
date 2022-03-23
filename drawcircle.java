import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class drawcircle extends Canvas
{

	public drawcircle()
	{	
	}
	public void paint( Graphics window ) {
		window.setColor(Color.WHITE);
		int x1 = 10;
		int y1=10;
		for(int x = 10; x<810;x+=100) {
			for(int y = 10; y<810;y+=100) {
				window.drawOval(x,y,90,90);
			}
		}
	}
}
