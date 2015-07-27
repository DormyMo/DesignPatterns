package strategy_pattern;

/**
 * Created by modm on 2015/7/27.
 * ²ßÂÔÄ£Ê½
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task(new StrategyA());
        task.doAction();


        task = new Task(new StrategyB());
        task.doAction();
    }
}
