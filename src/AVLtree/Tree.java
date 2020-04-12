package AVLtree;

/**
 *
 * @author maidul
 * @param <T>
 */
public interface Tree<T extends Comparable<T>>{
    public void insert(T data);
    public void traverse();
    public Node<T> delete(T data);
}
