package com.telran;

import com.telran.collection.SortedNumbersList;

public class Application {
    public static void main(String[] args) {
        int[] listArray = new int[]{19, 8, -6, 34, 8, -7, 24, -58, -6};

        SortedNumbersList list = new SortedNumbersList(listArray);
        list.display();
        boolean deleted = list.remove(-6);
        System.out.println("-6 was deleted: " + deleted);
        list.display();
        boolean contains = list.contains(34);
        System.out.println(contains);
        list.removeById(3);
        list.display();
        SortedNumbersList list2 = new SortedNumbersList(new int[]{2, 7, 8, 9, 15, -31, 78, 78, 78,});
        list2.display();
        list2.removeRepeated();
        list2.display();
        SortedNumbersList list4 = list.union(list2);
        list4.display();
    }
}