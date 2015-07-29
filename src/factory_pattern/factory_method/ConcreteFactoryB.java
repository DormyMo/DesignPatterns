package factory_pattern.factory_method;

/**
 * Created by modm on 2015/7/28.
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product create() {
        return new ConcreteProductB();
    }
}
