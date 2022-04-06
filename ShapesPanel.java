import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ShapesPanel extends JPanel {
        private List<ShapeItem> shapes;
        private int rand = 0;

        public ShapesPanel(List<ShapeItem> shapesList) {
            this.shapes = shapesList;

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Color color = getRandomColor();
                    for (ShapeItem item : shapes) {
                        if (item.getShape().contains(e.getPoint())) {
                            item.setColor(color);
                            rand+=1;
                        }
                    }
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();

            for (ShapeItem item : shapes) {
                g2.setColor(item.getColor());
                g2.fill(item.getShape());
            }

            g2.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 300);
        }

        private Color getRandomColor() {
            if(rand%2==0) {
            	return new Color(255,0,0);
            }
        return new Color(255,255,0);
        }
        
}