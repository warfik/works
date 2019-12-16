package com.telran;

import com.telran.randomazer.*;
import com.telran.randomazer.randomaze_rules.*;

public class Application {

    public static void main(String[] args) {


        RuleRandomInterface ruleMinMax = new RuleRandomInterfaceMinMax(20, 60);
        RuleRandomInterface ruleLotto = new RuleRandomInterfaceLotto(1, 5, 10, 15, 20, 25);
        RuleRandomInterface ruleRussianRoulette = new RuleRandomInterfaceRussianRoulette(3);
        RuleRandomInterface ruleGetRandom = new RuleGetRandomInterface(5,200);

        Randomize fromTo = new Randomize(ruleMinMax);
        Randomize lotto = new Randomize(ruleLotto);
        Randomize russianRoulette = new Randomize(ruleRussianRoulette);
        Randomize getRandom = new Randomize(ruleGetRandom);

        System.out.println(fromTo.next());
        System.out.println(lotto.next());
        System.out.println(russianRoulette.next());
        System.out.println(getRandom.next());
    }
}
