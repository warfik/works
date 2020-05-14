package com.telran;

import javax.swing.text.html.HTMLDocument;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Date date= new Date();
        System.out.println(date);
        System.out.println(LocalDate.of(1984,12,20));
        System.out.println(LocalDate.of(1984,12,20));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");
        LocalDate date1= LocalDate.parse("12.20.84",format);
        date1.format(format);
        System.out.println(date1);


        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = localDate.format(formatter);
        LocalTime localTime = LocalTime.of(19,00);
        LocalTime now = LocalTime.now();
        LocalTime now1= LocalTime.();

        ZonedDateTime ztime= ZonedDateTime.of(LocalDateTime);

        now.plus(1,ChronoUnit.MINUTES.between(localTime,now));
        System.out.println("-*-*-*-*-");


        DateTimeFormatter f= DateTimeFormatter.ofPattern("hh-mm");
        String fS = localTime.format(f);
        localTime.plus(1,ChronoUnit.HOURS);


        System.out.println( localTime.plus(Duration.ofHours(1)));

        Period diff;

//        int days = ChronoUnit.DAYS.between();
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);



    }
}
