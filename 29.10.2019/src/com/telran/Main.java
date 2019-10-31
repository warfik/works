package com.telran;

public class Main {

    public static void main(String[] args) {
        int array1[];
        array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = fillArray(20);
        array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(array2);
        }
    static int[] fillArray(int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            if (res[i] > 0) {
                res[i] = i * 3;
            }
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

//1.(бул)есть массив. определить есть ли в нем нечетные числа.
//2.есть массив. сложить все нечетные числа из него.
//3.есть массив (все положительные числа умножаем на 3 и вывести).
//4.вывести в массиве число фибоначи.
//5.найти функцию, определяющую, есть ли в данном массиве определенное число.