package adapter_pattern;

/**
 * Created by modm on 2015/7/31.
 * <a href="http://www.oodesign.com/adapter-pattern.html">http://www.oodesign.com/adapter-pattern.html</a>
 * <img src="http://www.oodesign.com/images/structural/adapter-pattern.png"></img>
 *
 * Target - defines the domain-specific interface that Client uses.
 * Adapter - adapts the interface Adaptee to the Target interface.
 * Adaptee - defines an existing interface that needs adapting.
 *  Client - collaborates with objects conforming to the Target interface.
 *
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.Adaptee2TargetAdapter(new AdapteeA()).request();
    }
}
