package command_pattern;

/**
 * Created by modm on 2015/7/29.
 * <a href="http://www.oodesign.com/command-pattern.html"></a>
 * <img src="http://www.oodesign.com/images/design_patterns/behavioral/command_implementation_-_uml_class_diagram.gif"></img>
 */
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand(new Receiver()));

    }
}
