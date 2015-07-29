package factory_pattern.abstract_factory;

/**
 * Created by modm on 2015/7/28.
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product create() {
        return new ConcreteProductB();
    }
}
