package com.telran;

public class Search {
    public static void main(String[] args) {
        int index = lSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        print(67, index);
    }

    public static void print(int eToSearch, int index) {
        if (index == -1) {
            System.out.println(eToSearch + " not found.");
        } else {
            System.out.println(eToSearch + " found at index: " + index);
        }
    }

    public static int lSearch(int arr[], int eToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == eToSearch)
                return i;
        }
        return -1;
    }

}
