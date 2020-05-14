package com.telran.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxStack {
    List<Integer> source = new ArrayList<>();
    List<Integer> maxSource = new ArrayList<>();
    maxSource

    public  void addLast(Integer elt) {
        source.add(elt);
        maxSource.add(elt);
    }

    public Integer getLast() {
        return source.get(size() -1);
    }

    public Integer removeLast() {
        return source.remove(size() - 1);
    }

    public int size() {
        return source.size();
    }
// вернуть максимум числа из stack
    public Integer max() {
        return Collections.max(source);

    }
}