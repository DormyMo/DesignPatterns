package factory_pattern.abstract_factory;

/**
 * Created by modm on 2015/7/29.
 */
public class Creator {
    private Factory mFactory;
    public Creator(Factory factory)
    {
        this.mFactory = factory;
    }
    public Product create()
    {
        return this.mFactory.create();
    }
}
