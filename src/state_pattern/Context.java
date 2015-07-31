package state_pattern;

/**
 * Created by modm on 2015/7/31.
 */
public class Context {
    private State state;
    public  Context()
    {
        setState(new ConcreteStateA());
    }
    public void setState(State state)
    {
        this.state=state;
    }
    public void request()
    {
        this.state.handle();
        this.state = new ConcreteStateB();
    }
}
