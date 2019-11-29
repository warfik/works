package com.telran.collection;

public class OurArrayList {
    Object[] source;
    private static final int INIT=16;
    private int size;

    public OurArrayList(){
        source = new Object[INIT];
    }
    public int size(){
        return size;
    }
}
