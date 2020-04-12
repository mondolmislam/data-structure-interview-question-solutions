package BinarySearchTree;

/**
 *
 * @author maidul
 */
public class App {

    public static void main(String[] args) {
        Tree<Integer> t = new BinarySearchTree<>();
        t.insert(Integer.SIZE);
        t.insert(-12);
        t.insert(-1);
        t.insert(10);
        t.insert(5);
        t.insert(35);
        t.insert(50);
        
        Tree<Integer> t1 = new BinarySearchTree<>();
        t1.insert(Integer.SIZE);
        t1.insert(-12);
        t1.insert(-1);
        t1.insert(10);
        t1.insert(5);
        t1.insert(35);
        t1.insert(50);
        
        Tree<Integer> t2 = new BinarySearchTree<>();
        t2.insert(1);
        t2.insert(2);
        t2.insert(3);
        t2.insert(4);
        t2.insert(5);
        t2.insert(6);
        t2.insert(7);
        TreeCompareHelper<Integer> tc=new TreeCompareHelper<>();
        System.out.println(tc.compareTrees(t1.getRootNode(), t.getRootNode()));
        
        System.out.println(t2.sumOfPersionAge(t2.getRootNode()));
    }
}
