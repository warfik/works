package com.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        isMultiplication2(,3);

    }


    public static boolean isMultiplication2(List<Integer> nums,int N){
        for (int i = 0; i < nums.size() ; i++) {
            int mul1 = nums.get(i);
            for (int j = i+1; j < nums.size(); j++) {
                int mul2 = nums.get(j);
                if (mul1*mul2 ==N)
                    return true;
            }
        }
        return false;
    }

}
