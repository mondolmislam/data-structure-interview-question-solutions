package AVLtree;

/**
 *
 * @author maidul
 * @param <T>
 */
public class AVLTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> node, T data) {
        if (node == null) {
            return node = new Node<>(data);
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftNode(insert(node.getLeftNode(), data));
        } else {
            node.setRightNode(insert(node.getRightNode(), data));
        }

        node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
        node = settleViolation(node, data);

        return node;
    }

    private Node<T> settleViolation(Node<T> node, T data) {
        int balance = getBalance(node);
        //left havy situation
        if (balance > 1 && data.compareTo(node.getLeftNode().getData()) < 0) {
            return rightRotation(node);
        }
        //right(right right situation) havy situation
        if (balance < -1 && data.compareTo(node.getRightNode().getData()) > 0) {
            return leftRotation(node);
        }
        //left right situation
        if (balance > 1 && data.compareTo(node.getLeftNode().getData()) > 0) {
            node.setLeftNode(leftRotation(node.getLeftNode()));
            return rightRotation(node);
        }
        //right left situation
        if (balance < -1 && data.compareTo(node.getRightNode().getData()) < 0) {
            node.setRightNode(rightRotation(node.getRightNode()));
            return leftRotation(node);
        }
        return node;
    }

    private Node rightRotation(Node node) {
        System.out.println("Rotating to the right on node " + node);
        Node tmpLeftNode = node.getLeftNode();
        Node t = tmpLeftNode.getRightNode();

        tmpLeftNode.setRightNode(node);
        node.setLeftNode(t);

        node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
        tmpLeftNode.setHeight(Math.max(height(tmpLeftNode.getLeftNode()), height(tmpLeftNode.getRightNode())) + 1);
        return tmpLeftNode;
    }

    private Node leftRotation(Node node) {
        System.out.println("Rotating to the Left on node " + node);
        Node tmpRightNode = node.getRightNode();
        Node t = tmpRightNode.getLeftNode();

        tmpRightNode.setLeftNode(node);
        node.setRightNode(t);

        node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
        tmpRightNode.setHeight(Math.max(height(tmpRightNode.getLeftNode()), height(tmpRightNode.getRightNode())) + 1);
        return tmpRightNode;
    }

    private int height(Node<T> node) {
        if (node == null) {
            return -1;
        }
        return node.getHeight();
    }

    private int getBalance(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeftNode()) - height(node.getRightNode());
    }

    @Override
    public void traverse() {
        if (root == null) {
            return;
        }
        inOrderTraverse(root);
    }

    private void inOrderTraverse(Node<T> node) {
        if (node.getLeftNode() != null) {
            inOrderTraverse(node.getLeftNode());
        }
        System.out.println(node);
        if (node.getRightNode() != null) {
            inOrderTraverse(node.getRightNode());
        }
    }

    @Override
    public Node<T> delete(T data) {
        return delete(root, data);
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
            //found we have to remove the node
            //left node ==null && right child node null
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                System.out.println("Removing leaf node....");
                return null;
            }
            //left node!=null that's mean one child in right side
            if (node.getLeftNode() == null) {
                Node<T> tmpNode = node.getRightNode();
                node = null;
                return tmpNode;
            } else if (node.getRightNode() == null) { // one node in left side
                Node<T> tmpNode = node.getLeftNode();
                node = null;
                return tmpNode;
            }
            // that's mean node has two child
            // need to find predecessor from left max node
            Node<T> tmpNode = getPredecessor(node.getLeftNode());
            node.setData(tmpNode.getData());
            node.setLeftNode(delete(node.getLeftNode(),tmpNode.getData()));
        }
        //after delete calculate Max height and set height
        node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
        //check avl tree rules break or not
        return settleDelete(node);
    }

    private Node getPredecessor(Node<T> node) {
        if (node.getRightNode() != null) {
            return getPredecessor(node.getRightNode());
        }
        return node;
    }

    private Node<T> settleDelete(Node<T> node) {
        int balance = getBalance(node);
        // left havvy tree 
        if (balance > 1) {
            //left right havy
            if (getBalance(node.getLeftNode()) < 0) {
                node.setLeftNode(leftRotation(node.getLeftNode()));
            }
            //left left
            return rightRotation(node);
        }
        //right havvy tree
        if (balance < -1) {
            //right left
            if (getBalance(node.getRightNode()) > 0) {
                node.setRightNode(node.getRightNode());
            }
            //right right havy need left rotation
            return leftRotation(node);
        }
        return node;
    }
}
