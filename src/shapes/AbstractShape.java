package shapes;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractShape extends JPanel implements Drawable {

    public int x = 220;
    public int y = 50;
    public int dimension = 100;
    public Color color = new Color(0xF8FF3C);
    int width = 10;
    BasicStroke thickness = new BasicStroke(width);

    public AbstractShape() {
    }

}
