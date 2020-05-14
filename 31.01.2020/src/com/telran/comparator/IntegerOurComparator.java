package com.telran.comparator;

public class IntegerOurComparator extends OurComparator {

    @Override
    public int compare(Object o1, Object o2) {
        int i1 = (int) o1;
        int i2 = (int) o2;
        return i1 - i2;
    }
}
