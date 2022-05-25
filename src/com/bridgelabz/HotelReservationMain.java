package com.bridgelabz;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.time.LocalDate;
import java.util.Scanner;

public class HotelReservationMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //long ammountLakwood, ammountBridgewood, ammountRidgewood;
        System.out.println("Welcome to Hotel reservation System...");
        Hotel hotel1 = new Hotel("Lakewood", 110);
        Hotel hotel2 = new Hotel("Bridgewood", 160);
        Hotel hotel3 = new Hotel("Ridgewood", 220);
        hotel1.display();
        hotel2.display();
        hotel3.display();


        LocalDate fromDateObject;
        LocalDate toDateObject;
        try {
        System.out.println("Enter the start date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
        fromDateObject = LocalDate.parse(scanner.next());
        System.out.println("Enter the end date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
        toDateObject = LocalDate.parse(scanner.next());



            System.out.println("object  'date' : " + fromDateObject);
            System.out.println("object  'date' : " + toDateObject);
            hotel1.findAmmount(fromDateObject,toDateObject);
            hotel2.findAmmount(fromDateObject,toDateObject);
            hotel3.findAmmount(fromDateObject,toDateObject);
        } catch (Exception e) {
            System.out.println("exception genrated " + e);
        }




        if (hotel1.getTotalAmmount() > hotel2.getTotalAmmount() && hotel3.getTotalAmmount() > hotel2.getTotalAmmount())
            System.out.println("The Hotel Bridgewood is the cheapest hotel. Requires ammount of " + hotel2.getTotalAmmount() + "$");
        else if (hotel1.getTotalAmmount() < hotel3.getTotalAmmount())
            System.out.println("The Hotel Lakewood is the cheapest hotel. Requires ammount of " + hotel1.getTotalAmmount() + "$");
        else
            System.out.println("The Hotel Ridgewood is the cheapest hotel. Requires ammount of " + hotel3.getTotalAmmount() + "$");
    }


}
