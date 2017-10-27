package iteratble.iterator;

/**
 * http://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        /*for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }*/
        for(String elem:namesRepository){
            System.out.println(elem);
        }
    }
}
