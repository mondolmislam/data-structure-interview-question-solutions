package redBlackTree;

/**
 *
 * @author maidulW
 */
public class App {
    public static void main(String[] args) {
       Tree tree = new RedBlackTree();
       
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
      
        tree.traversal();
    }
}
