package com.telran;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Juri")) {
            System.out.println("******************");
            System.out.println("Your name is: Juri");
            System.out.println("You are is: " + myare());
        }
        else {
            System.out.println("Your name is not Juri. \nYour name is: " + name);
            System.out.println("You are is unavailable.");
        }
    }
    private static int myare()
    {
        return 34;
    }
}


