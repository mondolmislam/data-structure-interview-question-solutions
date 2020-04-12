package stackLinkedList;

/**
 *
 * @author maidul
 * @param <T>
 */
public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push(T data) {
        ++count;
        if (this.root == null) {
            this.root = new Node<>(data);
        } else {
            Node<T> oldData = this.root;
            this.root = new Node<>(data);
            this.root.setNextNode(oldData);
        }
    }

    public T pop() {
        --count;
        T data = this.root.getData();
        this.root = this.root.getNextNode();
        return data;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
}
