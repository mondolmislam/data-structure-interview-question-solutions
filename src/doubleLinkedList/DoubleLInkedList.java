package doubleLinkedList;

/**
 *
 * @author maidul
 * @param <T>
 */
public class DoubleLInkedList<T extends Comparable<T>> implements DoubleList<T> {

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void getReverseList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(T data) {
        ++sizeOfList;
        if (this.root == null) {
            this.root = new Node<>(data);
            this.root.setNextNode(null);
            this.root.setPreviousNode(null);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(this.root);
            newNode.setPreviousNode(null);
            this.root = newNode;
        }
    }

    @Override
    public void remove(T data) {
        try{
        if (this.root == null) {
            return;
        }
        Node<T> actualNode = this.root;
        while (this.root.nextNode != null) {
            if(actualNode.getData().compareTo(data)==0){
                actualNode.getPreviousNode().setNextNode(actualNode.getNextNode());
                actualNode.getNextNode().setPreviousNode(actualNode.getPreviousNode());
                return;
            }
            actualNode = actualNode.getNextNode();
            actualNode = actualNode.getNextNode();
        }
        }catch(Exception e){
            System.out.println("");
        }
    }

    @Override
    public void traverseList() {
        if (this.root == null) {
            return;
        }
        Node<T> actualNode = this.root;
        while (actualNode != null) {
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

}
