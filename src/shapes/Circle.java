package shapes;

import java.awt.*;

public class Circle extends AbstractShape {
    public Circle(){

    }

    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(new Color(0xFF2115));
        g2.drawOval(340, 50, 100, 100);
    }

}
