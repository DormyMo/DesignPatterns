package adapter_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class AdapteeA implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("AdapteeA specificRequest");
    }
}
