package com.satendranegi.javalearnings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeDemo {

    public static void main(String[] args) {

        //Date date = new Date();
        //System.out.println(date.toInstant());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(localDateTime.getNano());
    }
}
