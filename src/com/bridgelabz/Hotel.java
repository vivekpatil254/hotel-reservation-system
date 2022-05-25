package com.bridgelabz;


import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.util.concurrent.TimeUnit.DAYS;

public class Hotel {
    private long totalAmmount;
    Scanner scanner = new Scanner(System.in);
    private String hotelName;
    private String fromDate;
    private String toDate;
    private int regulerCustomerRate;

    public Hotel(String name, int rate) {
        hotelName = name;
        regulerCustomerRate = rate;
    }

    public long getTotalAmmount() {
        return totalAmmount;
    }

    public void setTotalAmmount(long totalAmmount) {
        this.totalAmmount = totalAmmount;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getRegulerCustomerRate() {
        return regulerCustomerRate;
    }

    public void setRegulerCustomerRate(int regulerCustomerRate) {
        this.regulerCustomerRate = regulerCustomerRate;
    }

    public void display() {
        System.out.println("\nHotel name            : " + hotelName);
        System.out.println("Reguler Customer rate : " + regulerCustomerRate);
    }




    public long findAmmount(LocalDate fromDateObject, LocalDate toDateObject) {
        long numberOfDays = 0;
        try {

            numberOfDays = ChronoUnit.DAYS.between(fromDateObject, toDateObject);
            System.out.println(numberOfDays);
            totalAmmount = numberOfDays * regulerCustomerRate;
            System.out.println(totalAmmount);

        } catch (Exception e) {
            System.out.println(" exeception genrated in find ammount" + e);
        }
        return totalAmmount;
    }
}
