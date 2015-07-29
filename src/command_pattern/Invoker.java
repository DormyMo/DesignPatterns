package command_pattern;

/**
 * Created by modm on 2015/7/29.
 */
public class Invoker {
    public void setCommand(Command command)
    {
        command.execute();
    }
}
