package com.telran;

import java.util.Arrays;
public class SelectedSortAndBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 10, 12, 5, 8, 9, 50, 44, 41, 20, 6, 10, 14, 19, 7,};
        selectionSortArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println(binarySearch(array,50));
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }


    public static void selectionSortArray(int arr[]) {
        int min, temp;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
