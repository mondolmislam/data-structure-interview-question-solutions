package queueLinkedList;

/**
 *
 * @author maidul
 * @param <T>
 */
public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    private boolean isEmpty() {
        return this.firstNode == null;
    }

    public void enqueue(T newData) {
        this.count++;
        Node<T> oldNode = this.lastNode;
        this.lastNode = new Node<>(newData);
        this.lastNode.setNextNode(null);
        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldNode.setNextNode(this.lastNode);
        }
    }

    public T dequeue() {
        this.count--;
        T data = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();
        if (isEmpty()) {
            this.lastNode = null;
        }
        return data;
    }
    
    public int size(){
        return this.count;
    }
}
