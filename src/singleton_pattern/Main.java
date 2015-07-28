package singleton_pattern;

/**
 * Created by modm on 2015/7/28.
 */
public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.hello();
    }
}
