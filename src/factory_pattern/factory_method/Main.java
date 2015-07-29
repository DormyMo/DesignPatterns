package factory_pattern.factory_method;

/**
 * Created by modm on 2015/7/28.
 */
public class Main {
    public static void main(String[] args) {
        Factory concreteFactoryA = new ConcreteFactoryA();
        Product productA = concreteFactoryA.create();
        System.out.println(productA.getType());

        Factory concreteFactoryB = new ConcreteFactoryB();
        Product productB = concreteFactoryB.create();
        System.out.println(productB.getType());
    }
}
