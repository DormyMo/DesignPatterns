package observer_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class ResponseA implements Observer {
    private String mContext;
    @Override
    public void update(String context) {
        this.mContext = context;
        this.show();
    }
    public void show()
    {
        System.out.println("A say "+this.mContext);
    }
}
