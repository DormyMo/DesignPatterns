package state_pattern;

/**
 * Created by modm on 2015/7/31.
 * <a href="https://en.wikipedia.org/wiki/State_pattern"></a>
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/State_Design_Pattern_UML_Class_Diagram.svg/400px-State_Design_Pattern_UML_Class_Diagram.svg.png"></img>
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        //state A
        context.request();
        //state changed to B
        context.request();
    }
}
