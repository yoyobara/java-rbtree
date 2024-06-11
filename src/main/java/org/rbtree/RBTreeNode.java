package org.rbtree;

public class RBTreeNode<T> {
    T value;
    boolean isRed = true;
    RBTreeNode<T> left = null;
    RBTreeNode<T> right = null;
    RBTreeNode<T> parent = null;

    RBTreeNode(T value, boolean isRed, RBTreeNode<T> parent) {
        this.value = value;
        this.isRed = isRed;
    }

    RBTreeNode<T> getGrandParent() {
        return this.parent.parent;
    }

    RBTreeNode<T> getUncle() {
        RBTreeNode<T> grandparent = getGrandParent();
        if (grandparent.left == this.parent)
            return grandparent.right;
        else {
            return grandparent.left;
        }
    }

    boolean isRightChild() {
        return this.parent.right == this;
    }

    boolean isLeftChild() {
        return !isRightChild();
    }

    void setRed() {
        this.isRed = true;
    }

    void setBlack() {
        this.isRed = false;
    }
}
