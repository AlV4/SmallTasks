package shapes;

import java.awt.*;

public class Square extends Shape{
    public Square() {
    }
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.drawRect(300, 300, 100, 100);
    }
}
