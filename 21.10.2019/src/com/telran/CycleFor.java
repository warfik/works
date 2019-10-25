package com.telran;

public class CycleFor {

    public static void main(String[] args) {
        // first assignment
        printDescendingNumbers(100, 10, 10);
        printDescendingNumbers(200, 100, 10);
        // second assignment: mult table
        printMultiplicationTable();
        // third assignment: sum of arithmetical progression
        int sum = getSumOfRange(1, 87, 1);
        System.out.println(sum);
        sum = getSumOfRange(5, 86, 3);
        System.out.println(sum);
        // numbers divided by 5, 7, 13
        printNumbersDividedBy5_7_13_toN(100);
        printNumbersDividedBy5_7_13_toN(1000);
    }

    private static void printNumbersDividedBy5_7_13_toN(int max) {

        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void printDescendingNumbers(int max, int min, int step) {
        for (int currentNumber = max; currentNumber >= min; currentNumber -= step) {
            System.out.println(currentNumber);
        }
    }
    static int getSumOfRange(int min, int max, int step) {
        int sum = 0;
        for (int currentNumber = min; currentNumber <= max; currentNumber += step) {
            sum += currentNumber;
        }
        return sum;
    }
    static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + ";\t");
            }
            System.out.println();
        }
    }
}