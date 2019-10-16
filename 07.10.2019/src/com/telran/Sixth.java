package com.telran;

public class Sixth {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 13;

        int i = 1;
        final int x = 1000;
        while (i <= x) {
            if (i % a == 0 || i % b == 0 || i % c == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
