package strategy_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class StrategyB implements Strategy{
    @Override
    public void doAction() {
        System.out.println("do something by StrategyB");
    }
}
