package org.rbtree;

public class RBTreeLogic {
    public static<T> int calculateSize(RBTreeNode<T> root) {
        if (root == null)
            return 0;

        return 1 + calculateSize(root.left) + calculateSize(root.right);
    }
}
