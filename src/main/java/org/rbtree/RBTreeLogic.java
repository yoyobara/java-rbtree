package org.rbtree;

public class RBTreeLogic {

    /*
    a recursive function to calculate the size of the tree.
     */
    public static<T> int recSize(RBTreeNode<T> root) {
        if (root == null)
            return 0;

        return 1 + recSize(root.left) + recSize(root.right);
    }

    // TODO check null safety
    /*
    a recursive function to check whether there is an element in the tree.
     */
    public static<T extends Comparable<T>> boolean recContains(RBTreeNode<T> root, T value) {
        if (root == null)
            return false;

        int cmp = value.compareTo(root.value);

        if (cmp == 0)
            return true;

        if (cmp > 0)
            return recContains(root.right, value);

        return recContains(root.left, value);
    }

    // given root is not null...
    // inserts new element and returns the inserted node. if exists already return null
    public static<T extends Comparable<T>> RBTreeNode<T> recInsert(RBTreeNode<T> root, T value) {
        int cmp = value.compareTo(root.value);

        if (cmp == 0)
            return null;

        if (cmp > 0) {
            if (root.right == null) {
                root.right = new RBTreeNode<>(value, true, root);
                return root.right;
            }

            return recInsert(root.right, value);
        } else {
            if (root.left == null) {
                root.left = new RBTreeNode<>(value, true, root);
                return root.left;
            }

            return recInsert(root.left, value);
        }
    }
}