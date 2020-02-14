package com.telran;

import java.util.List;

public class Tarakan implements Runnable {

    int id;
    int minTime;
    int maxTime;
    int nSteps;
    List<Finishinfo> winRate;

    public Tarakan(int id, int minTime, int maxTime, int nSteps, List<Finishinfo> winRate) {
        this.id = id;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.nSteps = nSteps;
        this.winRate = winRate;
    }

    @Override
    public void run() {

    }
}