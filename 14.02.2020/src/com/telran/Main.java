package com.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        static final int TARAKAN_NUM = 10;
        static final int MIN_TIME = 100;
        static final int MAX_TIME = 150;

            List<FinishInfo> winRate = new ArrayList<>();
            List<Thread> threads = makeTarakanThreads(winRate);
            long startTime = System.currentTimeMillis();
            start(threads);
            join(threads);

            printWiners(winRate, startTime);

        }
        List<Finishinfo> winRate = new ArrayList<>();
        System.out.print(winRate);
    }
}