package doubleLinkedList;

/**
 *
 * @author maidul
 */
public interface DoubleList<T extends Comparable<T>> {

    public void getReverseList();

    public void insert(T data);

    public void remove(T data);

    public void traverseList();

    public int size();
}
