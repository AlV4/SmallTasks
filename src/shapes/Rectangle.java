package shapes;

import java.awt.*;

public class Rectangle extends AbstractShape {
    protected int x = 220;
    protected int y = 50;
    protected Color color = new Color(0x0597FF);
    public Rectangle() {
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(color);
        g2.drawRect(x, y, 100, 100);

    }
}
