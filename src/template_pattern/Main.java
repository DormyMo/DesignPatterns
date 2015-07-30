package template_pattern;

/**
 * Created by modm on 2015/7/30.
 * <a href="https://en.wikipedia.org/wiki/Template_method_pattern"></a>
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Template_Method_UML.svg/468px-Template_Method_UML.svg.png"></img>
 */
public class Main {
    public static void main(String[] args) {
        Template object = new ConcreteClass();
        object.templateMethod();

    }
}
