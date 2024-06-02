package org.rbtree;

public class RBTreeNode<T> {
    T value;
    boolean isRed = true;
    RBTreeNode<T> left = null;
    RBTreeNode<T> right = null;

    RBTreeNode(T value, boolean isRed) {
        this.value = value;
        this.isRed = isRed;
    }
}
