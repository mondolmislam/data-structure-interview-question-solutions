package redBlackTree;

/**
 *
 * @author maidul
 * @param <T>
 */
public interface Tree<T extends Comparable<T>>{
    public void traversal();
    public void insert(T data);
}
