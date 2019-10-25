package com.telran;

public class Third {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a != 11) {
            while (b != 11) {
                System.out.print(a + " * " + b + " = " + a * b + "\t ");
                b++;
            }
            System.out.println();
            a++;
            b = 1;
        }
    }
}
