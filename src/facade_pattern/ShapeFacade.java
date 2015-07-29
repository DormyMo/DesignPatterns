package facade_pattern;

/**
 * Created by modm on 2015/7/29.
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
