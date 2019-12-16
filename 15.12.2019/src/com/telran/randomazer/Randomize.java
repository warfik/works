package com.telran.randomazer;


import com.telran.randomazer.RuleRandomInterface;

public class Randomize {
    private RuleRandomInterface rule;

    public Randomize(RuleRandomInterface rule) {
        this.rule = rule;
    }

    public Object next() {
        System.out.println();
        return rule.getRandom();
    }
}
