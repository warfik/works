package com.telran.collection;

import java.util.Comparator;
import java.util.Iterator;

public class OurTreeSet<E> implements OurSet<E> {

    private TreeNode<E> root;
    private int size;
    private Comparator<E> comparator;

    public OurTreeSet(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public OurTreeSet() {
        this.comparator = (o1, o2) -> {
            Comparable<E> o1comparable = (Comparable<E>) o1;
            return o1comparable.compareTo(o2);
        };
    }

    @Override
    public boolean add(E elt) {
        if (root == null) {
            root = new TreeNode<>(elt);
            size++;
            return true;
        }

        TreeNode<E> parent = root;
        TreeNode<E> current = root;

        while (current != null && comparator.compare(elt, current.key) != 0) {
            parent = current;
            current = comparator.compare(elt, current.key) < 0 ? current.left : current.right;
        }

        if (current != null)
            return false;

        TreeNode<E> newNode = new TreeNode<>(elt);
        newNode.parent = parent;
        if (comparator.compare(elt, parent.key) < 0)
            parent.left = newNode;
        else
            parent.right = newNode;

        size++;
        return true;
    }

    @Override
    public boolean remove(E elt)
        { // (предполагается, что дерево не пусто)
            TreeNode<E> current = root;
            TreeNode<E> parent = root;
            boolean isLeftChild = true;
            while(current.iData != key) // Поиск узла
                {
                        parent = current;
            if(key < current.iData) // Двигаться налево?
            {
                isLeftChild = true;
                current = current.leftChild;
            }
            else // Или направо?
            {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null) // Конец цепочки
                return false; // Узел не найден
}
// Удаляемый узел найден
// Если узел не имеет потомков, он просто удаляется.
            if(current.leftChild==null &&
                    current.rightChild==null)
            {
                if(current == root) // Если узел является корневым,
                    root = null; // дерево очищается
                else if(isLeftChild)
                    parent.leftChild = null; // Узел отсоединяется
                else // от родителя
                    parent.rightChild = null;
            }
// Если нет правого потомка, узел заменяется левым поддеревом
            else if(current.rightChild==null)
                if(current == root)
                    root = current.leftChild;
                else if(isLeftChild)
                    parent.leftChild = current.leftChild;
                else
                    parent.rightChild = current.leftChild;
// Если нет левого потомка, узел заменяется правым поддеревом
            else if(current.leftChild==null)
                if(current == root)
                    root = current.rightChild;
                else if(isLeftChild)
                    parent.leftChild = current.rightChild;
                else
                    parent.rightChild = current.rightChild;
            else
                // Два потомка, узел заменяется преемникомreturn false;
    }

    @Override
    public boolean contains(E elt) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean addAll(OurSet<E> other) {
        return false;
    }

    @Override
    public boolean removeAll(OurSet<E> other) {
        return false;
    }

    @Override
    public boolean retainAll(OurSet<E> other) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private static class TreeNode<E> {
        public TreeNode(E key) {
            this.key = key;
        }

        TreeNode<E> parent;
        TreeNode<E> left;
        TreeNode<E> right;
        E key;
    }
}
