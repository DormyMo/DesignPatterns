package decorator_pattern;

/**
 * Created by modm on 2015/7/28.
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component)
    {
        this.component=component;
    }

    public Component getComponent() {
        return component;
    }

    public abstract void operation();

}
