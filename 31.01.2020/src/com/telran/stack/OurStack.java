package com.telran.stack;


import com.telran.EmptyListException;
import com.telran.IntegerOurComparator;
import com.telran.OurComparator;

import java.util.*;

public class MaxStack<E> {
    private List<E> source;

    public MaxStack() {
        source = new ArrayList<>();
    }

    public void addLast(E element) {
        source.add(element);
    }

    public E remove() {
        return source.remove(source.size() - 1);
    }

    public int getMax() throws EmptyListException {
        if (source.size() == 0)
            throw new EmptyListException();
        OurComparator comparator = new IntegerOurComparator();
        return (int) getMax(comparator);
    }


    public E getMax(OurComparator comparator) throws EmptyListException {
        if (source.size() == 0)
            throw new EmptyListException();

        E max = source.get(0);
        for (int i = 1; i < source.size(); i++) {
            if (comparator.compare(source.get(i), max) > 0)
                max = source.get(i);
        }
        return max;
    }
}
