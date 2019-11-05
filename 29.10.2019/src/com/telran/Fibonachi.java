package com.telran;

public class Fibonachi {

    public static void main(String[] args) {
        fib(20);
    }

    public static void fib(int n) {
        int[] Array = new int[n];
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
