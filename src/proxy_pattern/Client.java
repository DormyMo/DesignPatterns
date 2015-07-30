package proxy_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public class Client implements Subject {
    @Override
    public void doAction() {
        Proxy proxy = new Proxy();
        proxy.doAction();
    }
}
