package factory_pattern.simple_factory;

/**
 * Created by modm on 2015/7/28.
 */
public class Factory {
    public static Product createProduct(String type){
        if (type.equals("A"))
        {
            return new ConcreteProductA();
        }
        else if(type.equals("B"))
        {
            return new ConcreteProductB();
        }
        else
        {
            return null;
        }
    }
}
