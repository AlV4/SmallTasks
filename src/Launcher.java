import shapes.*;
import shapes.Rectangle;


public class Launcher {

    public static void main(String[] args) {

        Drawable[]shapes = {new Circle(), new Rectangle(), new Triangle(), new Square()};
        new ShapesTemplate(shapes);
    }

}
