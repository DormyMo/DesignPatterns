package adapter_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
