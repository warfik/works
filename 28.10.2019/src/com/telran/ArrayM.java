package com.telran;

public class ArrayM {
    public static void main(String[] args) {
        int array1[];
        array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = fillArray(20);
        printArray(array2);

        int[] array3 = twoAllArray(10);
        printArray(array3);

        int[] array4 = reverseArray( );
        printArray(array4);

    }
    static void sumTwoArray(int arr[]) {
        int total = 0;
        if (arr[] > 0){
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            System.out.println("sum is: " + total);
        }
    }
    static boolean

    static int[] fillArray(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i + 1;
        }
        return res;
    }


    static void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            System.out.println(arr[i]);
        }
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
