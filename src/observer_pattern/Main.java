package observer_pattern;

/**
 * Created by modm on 2015/7/27.
 * 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Observer responseA = new ResponseA();
        Observer responseB = new ResponseB();
        request.registObserver(responseA);
        request.registObserver(responseB);
        request.updateData("Hello World!");
    }
}
