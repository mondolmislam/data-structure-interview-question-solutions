package redBlackTree;

/**
 *
 * @author maidul
 * @param <T>
 */
public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    private NodeColor color;
    private Node<T> parent;

    public Node(T data) {
        this.data = data;
        this.color = NodeColor.RED;
    }

    @Override
    public String toString() {
        return ""+this.data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public NodeColor getColor() {
        return color;
    }

    public void setColor(NodeColor color) {
        this.color = color;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
    
    
    
    
}
