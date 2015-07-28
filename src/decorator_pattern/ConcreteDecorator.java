package decorator_pattern;

/**
 * Created by modm on 2015/7/28.
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.getComponent().operation();
        System.out.println("ConcreteDecorator opration");
    }
}
