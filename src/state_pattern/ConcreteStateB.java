package state_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("stateB handle");
    }
}
