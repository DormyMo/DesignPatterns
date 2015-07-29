package facade_pattern;

/**
 * Created by modm on 2015/7/29.
 * <a href="http://www.tutorialspoint.com/design_pattern/facade_pattern.htm"></a>
 * <img src="http://www.tutorialspoint.com/design_pattern/images/facade_pattern_uml_diagram.jpg"></img>
 */
public class Main {
    public static  void  main(String[] args){
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
