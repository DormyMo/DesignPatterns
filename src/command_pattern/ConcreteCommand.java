package command_pattern;

/**
 * Created by modm on 2015/7/29.
 */
public class ConcreteCommand implements Command {
    private Receiver mReceiver;
    public ConcreteCommand(Receiver receiver)
    {
        this.mReceiver=receiver;
    }
    @Override
    public void execute() {
        mReceiver.action();
    }
}
