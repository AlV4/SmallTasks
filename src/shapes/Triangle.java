package shapes;

import java.awt.*;

public class Triangle extends AbstractShape {

    int []x = {150, 200, 100};
    int []y = {50, 150, 150};
    int amount = 3;


    public Triangle() {
        super.color = new Color(163, 42, 255);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(color);
        g2.drawPolygon(x, y, amount);
    }
}
