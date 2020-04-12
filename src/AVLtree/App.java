package AVLtree;

/**
 *
 * @author maidul
 */
public class App {

    public static void main(String[] args) {
        Tree<Integer> t = new AVLTree<>();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(5);
        t.insert(7);
        t.insert(9);
//        System.out.println("First traversal");
//        t.traverse();
        t.delete(5);
        System.out.println("After delete");
        t.traverse();
    }
}
