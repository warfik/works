package com.telran;

public class Arrays {

    public static void main(String[] args) {
	// write your code here
   int totalGivenCredits = countTotalCredits(100);
        System.out.println(totalGivenCredits);
        System.out.println(countTotalCredits(100));
    }
    static int countTotalCredits(int creditNumber) {
        int totalGivenCredits = 0;
        for (int i = 1; i <= creditNumber; i++) {
            if (i % 13 == 0) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Masha proceeds credit number " + i);
            } else if (i % 3 == 1) {
                System.out.println("Petya proceeds credit number " + i);
            } else {
                System.out.println("Vasya proceeds credit number " + i);
            }
            totalGivenCredits++;
        }
        return totalGivenCredits;
    }

}
