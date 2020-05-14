package com.telran;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
    public static int prime( int a, int b){

        nextPrime:
        for (int i = b; i <= a; i++) {

            for (int j = 2; j < i; j++)
                if (i % j == 0) continue nextPrime;
            }
        return ;
        }
    }
}
