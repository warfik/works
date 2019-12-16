package com.telran.randomazer.randomaze_rules;

import com.telran.randomazer.RuleRandomInterface;

import java.util.Random;

public class RuleRandomInterfaceMinMax implements RuleRandomInterface {

    private int min;
    private int max;

    public RuleRandomInterfaceMinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Object getRandom() {
        Random random = new Random();
        int result = random.nextInt(max - min);
        return result + min;
    }
}
