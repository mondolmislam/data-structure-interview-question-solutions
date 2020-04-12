/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author maidul
 * @param <T>
 */
public class TreeCompareHelper<T extends Comparable<T>> {
    
    public boolean compareTrees(Node<T> node1, Node<T> node2) {
        // best case we have to == for two node equal
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }
        if (node1.getData().compareTo(node2.getData()) != 0) {
            return false;
        }
        // left tree and right tree must be same
        return compareTrees(node1.getLeftNode(), node2.getLeftNode()) && compareTrees(node1.getRightNode(), node2.getRightNode());
    }
}
