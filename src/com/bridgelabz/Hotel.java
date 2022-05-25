package com.bridgelabz;


import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.util.concurrent.TimeUnit.DAYS;

public class Hotel {
    Scanner scanner = new Scanner(System.in);
    private String hotelName, fromDate, toDate;
    private int regulerCustomerRate;
    private LocalDate fromDateObject;
    private LocalDate toDateObject;

    public Hotel(String name, int rate) {
        hotelName = name;
        regulerCustomerRate = rate;
    }

    public void display() {
        System.out.println("\nHotel name            : " + hotelName);
        System.out.println("Reguler Customer rate : " + regulerCustomerRate);
    }


    public void input() {
        System.out.println("Enter the start date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
        fromDate = scanner.next();
        System.out.println("Enter the end date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
        toDate = scanner.next();
        try {
            this.fromDateObject = LocalDate.parse(fromDate);
            this.toDateObject = LocalDate.parse(toDate);
            System.out.println("object  'date' : " + fromDateObject);
            System.out.println("object  'date' : " + toDateObject);
        } catch (Exception e) {
            System.out.println("exception genrated " + e);
        }
    }

    public long findAmmount() {
        long numberOfDays = 0, totalAmmount;
        try {

            numberOfDays = ChronoUnit.DAYS.between(fromDateObject,toDateObject);
            System.out.println(numberOfDays);

        } catch (Exception e) {
            System.out.println(" exeception genrated in find ammount" + e);
        }
        totalAmmount = numberOfDays * regulerCustomerRate;
        return totalAmmount;

    }
}
