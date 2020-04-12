package linkedlist;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        List<Person>list=new LinkedList<>();
        Person p=new Person(12,"Maria");
        list.insert(p);
        list.insert(new Person(11, "Howa"));       
        list.insert(new Person(21, "Moriam"));       
        list.insert(new Person(18, "Kudroti"));       
        
        
        list.traverseList();
        //list.remove(p);
        System.out.println("");
        list.traverseList();
        System.out.println("");
        System.out.println(list.getMiddleNode());
        list.getReverseList();
        System.out.println("");
        list.traverseList();
    }
}
