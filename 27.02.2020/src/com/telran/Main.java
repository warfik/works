package com.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        list.add("aaa");
        list.add("aaa");
        list.forEach((El) -> {
             if (El.compareTo(El)) {
                 ;
             }
            {
            System.out.print(El);
            result.add(El);}

        });
    }

}
