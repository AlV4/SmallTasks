package shapes;

import java.awt.*;

public class Circle extends Shape {
    public Circle(){

    }

    public void draw(Graphics g){
        g.setColor(new Color(0xFF2115));
        g.fillOval(340, 50, 100, 100);
    }

}
