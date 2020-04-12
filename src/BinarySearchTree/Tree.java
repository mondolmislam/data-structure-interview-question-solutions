package BinarySearchTree;

/**
 *
 * @author maidul
 * @param <T>
 */
public interface Tree<T extends Comparable<T>> {

    public void insert(T data);

    public void traverse();

    public void delete(T data);

    public T getMaxValue();

    public T getMinValue();
    
    public Node<T> getRootNode();
    
    public Node<T> getKSmalestNode(Node<T> node, int k);
    
    public int treeSize(Node<T>node);
    
    public int sumOfPersionAge(Node<T> node);
}
