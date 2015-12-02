package shapes;

import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle() {
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(new Color(0x0597FF));
        g2.drawRect(220, 50, 100, 100);

    }
}
