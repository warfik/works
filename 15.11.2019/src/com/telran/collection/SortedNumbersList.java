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
        int[] newArray = new int[0];
        for (int i = 0; i < source.length; i++) {
            if (source[i] == number) {
                continue;
            }
            newArray = ArrayUtils.append(newArray, source[i]);
        }
        boolean result = source.length != newArray.length;
        source = newArray;
        return result;
    }

    public void removeById(int index) {
        if (index > source.length - 1) {
            return;
        }
        int[] newArray = new int[source.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = source[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = source[i + 1];
        }
        source = newArray;
    }

    public void removeRepeated() {
        if (source.length < 2) {
            return;
        }
        int[] newArray = new int[0];
        int current = source[0];
        for (int i = 1; i < source.length; i++) {
            if (current == source[i]) {
                continue;
            }
            newArray = ArrayUtils.append(newArray, current);
            current = source[i];
        }
        newArray = ArrayUtils.append(newArray, current);
        source = newArray;
    }

    public SortedNumbersList intersection(SortedNumbersList another) {
        int[] intersectionArray = new int[0];
        for (int i = 0; i < source.length; i++) {
            int element = source[i];
            if (another.contains(element)) {
                intersectionArray = ArrayUtils.append(intersectionArray, element);
            }
        }
        SortedNumbersList result = new SortedNumbersList(intersectionArray);
        return result;
    }

    public SortedNumbersList union(SortedNumbersList another) {
        int[] newArray = new int[0];
        for (int i = 0; i < source.length; i++) {
            newArray = ArrayUtils.append(newArray, source[i]);
        }
        for (int j = 0; j < another.source.length; j++) {
            newArray = ArrayUtils.append(newArray, another.source[j]);
        }
        SortedNumbersList result = new SortedNumbersList(newArray);
        result.removeRepeated();
        return result;
    }

    public boolean contains(int number) {
        int result = ArrayUtils.binarySearch(source, number);
        if (result >= 0) {
            return true;
        }
        return false;
    }
}