package shapes;

import javax.swing.*;
import java.awt.*;

public class Shape extends JPanel implements Drawable {

    protected Color color = new Color(0xF8FF3C);

    public Shape() {

        }

    public void draw(Graphics g){
        super.paint(g);
    }

}
