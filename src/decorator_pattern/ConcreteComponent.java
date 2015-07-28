package decorator_pattern;

/**
 * Created by modm on 2015/7/28.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent opration");
    }
}
