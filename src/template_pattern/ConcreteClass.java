package template_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public class ConcreteClass extends Template {

    @Override
    protected void primitiveOperation1() {
        System.out.println("primitiveOperation1 by ConcreteClass");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("primitiveOperation2 by ConcreteClass");
    }
}
