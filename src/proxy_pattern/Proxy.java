package proxy_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public class Proxy implements Subject {
    @Override
    public void doAction() {
        // some java rmi operation
        RealSubject realSubject = new RealSubject();
        realSubject.doAction();
    }
}
