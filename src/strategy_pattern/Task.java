package strategy_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class Task {
    Strategy mStrategy;
    public Task(Strategy strategy)
    {
        this.mStrategy=strategy;
    }

    public void doAction()
    {
        mStrategy.doAction();
    }
}
