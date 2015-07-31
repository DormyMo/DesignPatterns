package state_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("stateA handle");
    }
}
