package com.telran;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

        List<Integer> ints = Arrays.asList(35, 52, 63, 50, 80);

        FS fo = new FS();
        fo.intsToFile(ints, "xxx.txt");

        System.out.println(fo.intsFromFile("xxx.txt"));

    }
}
