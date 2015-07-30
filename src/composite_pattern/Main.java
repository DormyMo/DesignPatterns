package composite_pattern;

/**
 * Created by modm on 2015/7/30.
 * <a href="https://en.wikipedia.org/wiki/Composite_pattern">https://en.wikipedia.org/wiki/Composite_pattern</a>
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/600px-Composite_UML_class_diagram_%28fixed%29.svg.png"></img>
 *    Component
 *   /      \
 * leafA   composite
 *         /      \
 *      leafB     leafC
 */
public class Main {
    public static void main(String[] args) {
        Leaf leafA = new Leaf();
        leafA.operation();

        Composite compositeB = new Composite();
        compositeB.operation();

        Leaf leafB = new Leaf();
        Leaf leafC = new Leaf();
        compositeB.addChild(leafB);
        compositeB.addChild(leafC);

        for (Component component : compositeB.getChild())
        {
            component.operation();
        }
    }
}
