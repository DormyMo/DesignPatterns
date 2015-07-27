package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by modm on 2015/7/27.
 */
public class Request implements Subject {
    private String mContext;
    private List<Observer> mObservers;
    public Request()
    {
        mObservers=new ArrayList<Observer>();
    }
    @Override
    public void registObserver(Observer o) {
        this.mObservers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
       this. mObservers.remove(o);

    }

    @Override
    public void notifyObserver() {
        for(Observer o :this.mObservers)
        {
            o.update(this.mContext);
        }
    }

    public void updateData(String context)
    {
        this.mContext=context;
        this.notifyObserver();
    }

}
