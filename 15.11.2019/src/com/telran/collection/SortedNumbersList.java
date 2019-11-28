package com.telran.collection;

import java.util.Arrays;

public class SortedNumbersList {
    private int[] source;

    public SortedNumbersList() {
        source = new int[0];
    }

    public SortedNumbersList(int[] array) {
        source = ArrayUtils.copyArray(array);
        ArrayUtils.selectionSort(source);
    }

    public void display() {
        System.out.println(Arrays.toString(source));
    }
    public void add(int number) {
        source = ArrayUtils.append(source, number);
        ArrayUtils.selectionSort(source);
    }

    public int get(int index) {
        return source[index];
    }
    public int size() {
        return source.length;
    }

    public boolean remove(int number) {
        int index = ArrayUtils.binarySearch(this.source, number);
        if (index < 0)
            return false;

        removeById(index);
        return true;
    }

    public void removeById(int index) {
        int[] newSource = new int[this.source.length - 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = this.source[i];
        }

        for (int i = index + 1; i < source.length; i++) {
            newSource[i - 1] = source[i];
        }

        this.source = newSource;
    }

    public void removeRepeated() {
        if (source.length == 0)
            return;

        int newLength = 1;

        for (int i = 1; i < source.length; i++) {
            if (source[i] != source[i - 1])
                newLength++;
        }

        int i = 1;
        int[] newSource = new int[newLength];

        newSource[0] = source[0];
        for (int j = 1; j < source.length; j++) {
            if (source[j] != source[j - 1])
                newSource[i++] = source[j];
        }
        source = newSource;

    }

    public SortedNumbersList intersection(SortedNumbersList another) {
        this.removeRepeated();
        another.removeRepeated();

        int newLength = 0;
        for (int i = 0; i < source.length; i++) {
            if (another.contains(source[i])) {
                newLength++;
            }
        }

        int[] newSource = new int[newLength];
        int counter = 0;
        for (int i = 0; i < source.length; i++) {
            if (another.contains(source[i]))
                newSource[counter++] = source[i];
        }
        return new SortedNumbersList(newSource);
    }

    public SortedNumbersList union(SortedNumbersList another) {
        int newLength = this.source.length + another.source.length;
        int[] newSource = new int[newLength];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }

        for (int i = 0; i < another.source.length; i++) {
            newSource[i + source.length] = another.source[i];
        }

        SortedNumbersList res = new SortedNumbersList(newSource);
        res.removeRepeated();

        return res;
    }

    public boolean contains(int number) {
        return ArrayUtils.binarySearch(this.source, number) >= 0;
    }

}
