package singleton_pattern;

/**
 * Created by modm on 2015/7/28.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            return new Singleton();
        }
        return instance;
    }

    public void hello()
    {
        System.out.println( "HelloWorld!" );
    }
}
