package linkedlist;

/**
 *
 * @author maidul
 * @param <T>
 */
public interface List<T extends Comparable<T>> {
    public Node<T> getMiddleNode();
    public void getReverseList();
    public void insert(T data);
    public void remove(T data);
    public void traverseList();
    public int size();
}
