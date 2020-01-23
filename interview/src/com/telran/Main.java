package com.telran;

public class Main {

    public static void main(String[] args) {}
    public static int gcd(int a, int b) {
        if (a < b) return -1;
        else {
            while (b >= 1) {
                int temp = a % b;
                a = b;
                b = temp;
            }
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a < b) return -1;
        return (a * b) / gcd(a, b);
    }

    public static int num3(int summ) {
        int res = 0;
        int[] array = {10, 5, 1};

        for (int i = 0; i < array.length; i++) {
            while (summ >= array[i]) {
                summ -= array[i];
                res++;
            }
        }
        return res;
    }

    public static int num4(int number) {
        int result = 0;
        int temp = 0;
        for (int i = 1; i < number; i++) {
            temp += i;
            result++;
            if (temp + 1 + i > number) {
                return result;
            }
        }
        return 1;
    }

    public static int fib(int n, int m) {
        if (m >= 1) {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < fib.length; i++) {
                fib[i] = fib[i - 2] + fib[i - 1];

            }
            return (int)(fib[n]) % m;
        } else return m;
    }
}


