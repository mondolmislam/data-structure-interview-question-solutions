package BinarySearchTree;

/**
 *
 * @author maidul
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (this.root == null) {
            this.root = new Node<>(data);
        }
        insertNode(data, this.root);
    }

    @Override
    public void traverse() {
        if (this.root != null) {
            inOrderTraverse(this.root);
        }
    }

    private void inOrderTraverse(Node<T> node) {
        if (node.getLeftNode() != null) {
            inOrderTraverse(node.getLeftNode());
        }
        System.out.print(node + " --> ");
        if (node.getRightNode() != null) {
            inOrderTraverse(node.getRightNode());
        }
    }

    @Override
    public void delete(T data) {
        if (this.root != null) {
            this.root = delete(this.root, data);
        }
    }

    private Node<T> delete(Node<T> node, T data) {
        if (node == null) {
            return node;
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftNode(delete(node.getLeftNode(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightNode(delete(node.getRightNode(), data));
        } else {
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                System.out.println("Removing leaf node from tree...");
                return null;
            }
            if (node.getLeftNode() == null) {
                System.out.println("Removing right node ...");
                Node<T> tempNode = node.getRightNode();
                node = null;
                return tempNode;
            } else if (node.getRightNode() == null) {
                System.out.println("Removing left node...");
                Node<T> tempNode = node.getLeftNode();
                node = null;
                return tempNode;
            }
            System.out.println("Removing node that has two child..");
            Node<T> tempNode = getPredecessor(node.getLeftNode());
            node.setData(tempNode.getData());
            node.setLeftNode(delete(node.getLeftNode(), data));

        }
        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (node.getRightNode() != null) {
            return getPredecessor(node.getRightNode());
        }
        return node;
    }

    @Override
    public T getMaxValue() {
        if (this.root == null) {
            return null;
        }
        return getMax(this.root);
    }

    private T getMax(Node<T> node) {
        if (node.getRightNode() != null) {
            return getMax(node.getRightNode());
        }
        return node.getData();
    }

    @Override
    public T getMinValue() {
        if (this.root == null) {
            return null;
        }
        return getMin(this.root);
    }

    private T getMin(Node<T> node) {
        if (node.getLeftNode() != null) {
            return getMin(node.getLeftNode());
        }
        return node.getData();
    }

    private void insertNode(T newData, Node<T> node) {
        if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftNode() != null) {
                insertNode(newData, node.getLeftNode());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setLeftNode(newNode);
            }
        } else {
            if (node.getRightNode() != null) {
                insertNode(newData, node.getRightNode());
            } else {
                Node<T> newNode = new Node<>(newData);
                node.setRightNode(newNode);
            }
        }
    }

    @Override
    public Node<T> getRootNode() {
        return this.root;
    }

    @Override
    public Node<T> getKSmalestNode(Node<T> node, int k) {
        //number of nodes in the left subtree
        //+1 because we count the root node of the subtree as well
        int n = treeSize(node.getLeftNode()) + 1;
        //this is when we find the kth smalest item
        if (n == k) {
            return node;
        }
        //if the number of nodes int the left subtree > kth smalest item
        // it means the kth smalest item is in the left subtree
        if (n > k) {
            return getKSmalestNode(node.getLeftNode(), k);
        }
        //if the number of nodes in the left subtree is smaller than the kth
        //smallest item then we can descard the left subtree and consider the right subtree
        // now we are not looking for the kth but the kth smalest item
        if (n < k) {
            return getKSmalestNode(node.getRightNode(), k - n);
        }

        return null;
    }

    @Override
    public int treeSize(Node<T> node) {
        if (node == null) {
            return 0;
        }
        //tree size=size left subtree+right sub tree+1(because of the root)
        return (treeSize(node.getLeftNode()) + treeSize(node.getRightNode()) + 1);
    }

    @Override
    public int sumOfPersionAge(Node<T> node) {
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() != null) {
            leftSum = sumOfPersionAge(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            rightSum = sumOfPersionAge(node.getRightNode());
        }
        sum = (Integer.valueOf(node.getData().toString()) + leftSum + rightSum);
        return sum;
    }
}
