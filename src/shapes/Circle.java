package shapes;

import java.awt.*;

public class Circle extends AbstractShape {
    public Circle(){
        x = 340;
        y = 50;
        color = new Color(0xFF2115);
        width = 5;
        thickness = new BasicStroke(width);
    }

    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(thickness);
        g2.setColor(color);
        g2.drawOval(x, y, dimension, dimension);
    }

}
