package composite_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println("leaf operation");
    }
}
