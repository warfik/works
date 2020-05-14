package com.telran;

import com.sun.source.tree.BinaryTree;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinaryTree.class

        int n = power(-3, -3);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n < 2)
            return 1;
        int res = n * factorial(n - 1);
        return res;
    }

    public static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (k < 0) {
            if (n == 0) {
                throw new IllegalArgumentException(
                        "НЕВОЗМОЖНО ВОЗВЕСТИ НОЛЬ В СТЕПЕНЬ ОТРИЦАТЕЛЬНОГО ЧИСЛА");
            }
            return 1 / power(n, -k);
        } else {
            int v = power(n, k / 2);
            int[] factor = { 1, n };
            return factor[k % 2] * v * v;
        }
    }

}
