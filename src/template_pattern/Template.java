package template_pattern;

/**
 * Created by modm on 2015/7/30.
 */
public abstract class Template {
    public final void templateMethod()
    {
        doSomething();
        primitiveOperation1();
        primitiveOperation2();
        doAbsolutelyThis();

    }
    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    private final void doAbsolutelyThis()
    {
        System.out.println("doAbsolutelyThis");
    }
    private void doSomething()
    {
        System.out.println("doSomething");
    }


}
