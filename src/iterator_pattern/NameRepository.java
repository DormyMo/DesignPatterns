package iterator_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class NameRepository implements Container {
    public String names[] = {"ada","bob","cindy","dormy"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{

        private int index;
        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext())
            {
                return names[index++];
            }
            else
            {
                return  null;
            }

        }
    }
}
