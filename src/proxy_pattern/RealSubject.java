package proxy_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public class RealSubject implements Subject {
    @Override
    public void doAction() {
        System.out.println("remote subject do the action");
    }
}
