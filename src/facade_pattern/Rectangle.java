package facade_pattern;

/**
 * Created by modm on 2015/7/29.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
