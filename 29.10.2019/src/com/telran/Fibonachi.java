package com.telran;

public class Fibonachi {

    public static void main(String[] args) {
        fib();
    }

    public static void fib() {
        int[] Array = new int[20];
        for (int i = 0; i < Array.length; i++) {
            if (i < 2) {
                Array[i] = 1;
            } else {
                Array[i] = Array[i - 2] + Array[i - 1];
            }
            System.out.print(Array[i] + " ");
        }
    }
}
