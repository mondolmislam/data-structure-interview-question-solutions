package doubleLinkedList;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        DoubleList<Person> plist=new DoubleLInkedList<Person>();
        plist.insert(new Person(0, "AAA"));
        plist.insert(new Person(1, "BBB"));
        plist.insert(new Person(2, "CCC"));
        plist.insert(new Person(3, "DDD"));
        plist.traverseList();
        plist.remove(new Person(1, "BBB"));
        plist.traverseList();
    }
}
