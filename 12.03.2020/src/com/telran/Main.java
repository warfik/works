package com.telran;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZonedDateTime moscowS= ZonedDateTime.of(LocalDate.now(), LocalTime.of(9,00), ZoneId.of("Europa/Moskow"));

    }
    public static String isBetween(int heedle, int start,int end){

    }
    public static boolean getIntesection(int start1, int end1, int start2, int end2){
        if (start1 < start2 && start1 < end2) return false;
        if (start1 > start2 && start1 > end2) return false;
        if (start1 > start2 && )

    }

}
