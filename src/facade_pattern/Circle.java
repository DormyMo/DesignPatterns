package facade_pattern;

/**
 * Created by modm on 2015/7/29.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
