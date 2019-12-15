
package com.telran;

public class Application {

    public static void main(String[] args) {
        StringPerformanceTester tester = new StringPerformanceTester("hello ");
        ConcatTextInterface naiveConcatenator = new NaiveConcatentor();
        ConcatTextInterface builderConcatenator = new StringBuilderConcatenator();

        System.out.println(tester.perform(naiveConcatenator, 1000000));
        System.out.println(tester.perform(builderConcatenator, 1000000));
    }
}