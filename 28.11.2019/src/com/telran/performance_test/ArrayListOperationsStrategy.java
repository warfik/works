package com.telran.performance_test;

import com.telran.collection.OurArrayList;
import com.telran.collection.OurList;

public class ArrayListOperationsStrategy implements ListOperationsStrategy {
    private static final Object object = new Object();

    @Override
    public void append(int nTimes) {
        OurList list = new OurArrayList();
        for (int i = 0; i < nTimes; i++) {
            list.append(object);
        }
    }

    @Override
    public OurList getFilledList(int length) {
        return null;
    }


    @Override
    public void get(int nTimes, OurList list) {

    }
}
