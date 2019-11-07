package com.telran;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Enter your name: ");
        Scanner pin = new Scanner(System.in);
        if (pin.nextLine().equals("Juri")) {
            System.out.println("******************");
            System.out.println("Your name is: Juri");
            System.out.println("You are is: " + myare());
        }
        else {
            System.out.println("Your name is not Juri. Your name is: " + pin.nextLine());
            System.out.println("You are is unavailable.");
        }


    }
    private static int myare()
    {
        return 34;
    }
}

