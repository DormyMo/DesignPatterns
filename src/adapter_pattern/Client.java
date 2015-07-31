package adapter_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class Client {
    public Target Adaptee2TargetAdapter(Adaptee adaptee)
    {
        return new Adapter(adaptee);
    }
}
