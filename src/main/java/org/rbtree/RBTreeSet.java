package org.rbtree;
import java.util.*;

public class RBTreeSet<T extends Comparable<T>> implements Set<T> {
    private RBTreeNode<T> treeRoot;

    @Override
    public int size() {
        return RBTreeLogic.recSize(this.treeRoot);
    }

    @Override
    public boolean isEmpty() {
        return treeRoot == null;
    }

    @Override
    public boolean contains(Object o) {
        T casted = (T) o;
        return RBTreeLogic.recContains(this.treeRoot, casted);
    }

    @Override
    public boolean add(T t) {
        if (this.treeRoot == null) {
            this.treeRoot = new RBTreeNode<>(t, false, null);
            return true;
        }

        RBTreeNode<T> inserted = RBTreeLogic.recInsert(this.treeRoot, t);
        if (inserted == null) return false;

        // rotations, checking, etc
        // TODO

        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}