package iterator_pattern;

/**
 * Created by modm on 2015/7/27.
 */
public class Main {
    public static  void  main(String[] args){
        NameRepository nameRepository = new NameRepository();
        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
