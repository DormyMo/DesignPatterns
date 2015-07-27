package observer_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class ResponseB implements Observer {
    private String mContext;
    @Override
    public void update(String context) {
        this.mContext = context;
        this.show();
    }
    public void show()
    {
        System.out.println("B Say "+this.mContext);
    }
}
