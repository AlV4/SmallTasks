
import shapes.*;


public class Launcher {


    public static void main(String[] args) {
        Drawable[]shapes = {new Circle(), new Rectangle(), new Triangle()};
        new ShapesTemplate(shapes);
    }

}
