package shapes;

import java.awt.*;

public class Triangle extends Shape{

    int []x = {150, 200, 100};
    int []y = {50, 150, 150};
    int amount = 3;


    public Triangle() {
        super.color = new Color(163, 42, 255);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(x,y,amount);
    }
}
