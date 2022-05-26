package com.bridgelabz;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

public class Hotel {
    Scanner scanner = new Scanner(System.in);
    private long totalAmmount;
    private String hotelName;
    private int regulerCustomerRate;

    public Hotel(String name, int rate) {
        hotelName = name;
        regulerCustomerRate = rate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "totalAmmount=" + totalAmmount +
                ", scanner=" + scanner +
                ", hotelName='" + hotelName + '\'' +
                ", regulerCustomerRate=" + regulerCustomerRate +
                '}';
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

    public long findAmmount(long numberOfDays) {

        try {
            totalAmmount = numberOfDays * regulerCustomerRate;
        } catch (Exception e) {
            System.out.println(" exeception genrated in find ammount" + e);
        }
        return totalAmmount;
    }
}
