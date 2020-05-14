package com.telran;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Set;

public class Dictionary {
    public Dictionary(Set<String> words) {
        this.words = words;
    }

    Set<String> words;
    public List<String> split(String text){
        Deque<String> result = new Deque<String>() {
        };
        return splitRecursive(text, 0, result)? result: null;

    }

    private boolean splitRecursive(String text, int i, Deque<String> result) {
        if (i==text.length()-1)
            return true;
        for (String word:words) {

        }
        return false;
    }

}
