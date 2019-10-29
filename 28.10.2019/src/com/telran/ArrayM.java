package com.telran;

public class ArrayM {
    public static void main(String[] args) {
// fill in array with numbers 1-10
        int array1[];
        array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// fill in array with numbers 1-n
        int[] array2 = fillArray(20);
// print out array
        printArray(array2);

        // print array * 2;
        int[] array3 = twoAllArray(10);
        printArray(array3);
    }

    static int[] fillArray(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    static int[] twoAllArray(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i * 2;
        }
        return res;
    }

    static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
