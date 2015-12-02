package shapes;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ShapesTemplate extends JPanel {

    private Drawable[] abstractShapes;

    public ShapesTemplate(Drawable[] abstractShapes) {
        this.abstractShapes = abstractShapes;
        if (abstractShapes == null || abstractShapes.length < 1) {
            this.abstractShapes = new Drawable[0];
        }

        JFrame frame = new JFrame("DAY 6, 2D Graphics");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Drawable s : abstractShapes) {
            s.draw(g);
        }
    }

}
