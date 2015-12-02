package shapes;

import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle() {
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0x0597FF));
        g.fillRect(220, 50, 100, 100);

    }
}
