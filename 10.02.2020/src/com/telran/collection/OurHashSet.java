package com.telran.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OurHashSet<E> implements OurSet<E> {

    private final static Object INSTANCE = new Object();
    private Map<E, Object> source;

    public OurHashSet() {
        this.source = new HashMap<>();
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public boolean add(E elt) {
        return source.put(elt, INSTANCE) == null;
    }

    @Override
    public boolean remove(E elt) {
        return source.remove(elt) != null;
    }

    @Override
    public boolean contains(E elt) {
        return source.containsKey(elt);
    }


    @Override
    public boolean addAll(OurSet<E> other) {
        boolean res = false;
        for (E elt : other) {
            res |= this.add(elt);
        }

        return res;
    }

    @Override
    public boolean removeAll(OurSet<E> other) {
        boolean res = false;
        for (E elt : other) {
            res |= this.remove(elt);
        }
        return res;
    }

    @Override
    public boolean retainAll(OurSet<E> other) {
//        Iterator<E> iterator = this.iterator();
//
//        boolean res = false;
//        while (iterator.hasNext()) {
//            E elt = iterator.next();
//
//            if (!other.contains(elt)) {
//                iterator.remove();
//                res = true;
//            }
//        }

        OurSet<E> thisSubtractedOther = new OurHashSet<>();

        for (E elt : this) {
            if (!other.contains(elt))
                thisSubtractedOther.add(elt);
        }

        return this.removeAll(thisSubtractedOther);
    }

    @Override
    public Iterator<E> iterator() {
        return source.keySet().iterator();
    }
}