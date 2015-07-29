package factory_pattern.simple_factory;

/**
 * Created by modm on 2015/7/28.
 */
public class Main {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        System.out.println(productA.getType());

        Product productB = Factory.createProduct("B");
        System.out.println(productB.getType());
    }
}
