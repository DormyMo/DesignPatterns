package decorator_pattern;

/**
 * Created by modm on 2015/7/28.
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Decorator_UML_class_diagram.svg/400px-Decorator_UML_class_diagram.svg.png"></img>
 */
public class Main {
    public static void main(String[] args) {
        Component concreteCompnnent = new ConcreteComponent();
        concreteCompnnent=new ConcreteDecorator(concreteCompnnent);
        concreteCompnnent.operation();

    }

}
