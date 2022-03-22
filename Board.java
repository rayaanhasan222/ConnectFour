import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
public class board {
	private int[][] grid;	
	private int x;
	private int y;
	public static final int SCALE = 80;
	public static final int OFFSET = 10;
	
	
	public void drawGrid( Graphics window, Color col )
	{
		window.setColor(col);
    x = 0;
    y = 0;
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				if (grid[i][j] == 1)
				{
					window.fillOval(x, y, SCALE , SCALE );
				}
				if (grid[i][j] == 0)
				{
					window.drawOval(x, y, SCALE , SCALE );
				}
				x += (SCALE + OFFSET);
			}
			y += (SCALE + OFFSET);
			x = 0;
		}

		//loop through the grid and 
		//draw a filled rectangle for all 1s
		//draw a unfilled rectangle for all 0s
		
		//nested loops to go through grid
		
			//use SCALE and OFFSET
		
			//if 0
		
				//draw an unfilled rectangle
		
			//if 1
				
				//draw a filled rectangle
	}
	
	
}


