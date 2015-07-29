package factory_pattern.abstract_factory;

/**
 * Created by modm on 2015/7/28.
 */
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new Creator(new ConcreteFactoryA());
        Product productA = creatorA.create();
        System.out.println(productA.getType());

        Creator creatorB = new Creator(new ConcreteFactoryB());
        Product productB = creatorB.create();
        System.out.println(productB.getType());
    }
}
