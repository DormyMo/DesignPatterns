package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by modm on 2015/7/30.
 */
public class Composite extends Component {
    private List<Component> children;
    public Composite()
    {
        this.children = new ArrayList<Component>();
    }
    public void addChild(Component componet)
    {
        this.children.add(componet);
    }

    public void removeChild(Component componet)
    {
        this.children.remove(componet);
    }
    public List<Component> getChild()
    {
        return this.children;
    }
    @Override
    public void operation() {
        System.out.println("Composite operation");
    }
}
