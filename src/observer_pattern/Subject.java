package observer_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public interface Subject {
    public void registObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
