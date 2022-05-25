package com.bridgelabz;

import javax.print.attribute.HashPrintJobAttributeSet;

public class HotelReservationMain {

    public static void main(String[] args) {
        long ammountLakwood, ammountBridgewood, ammountRidgewood;
        System.out.println("Welcome to Hotel reservation System...");
        Hotel hotel1 = new Hotel("Lakewood", 110);
        Hotel hotel2 = new Hotel("Bridgewood", 160);
        Hotel hotel3 = new Hotel("Ridgewood", 220);
        hotel1.display();
        hotel2.display();
        hotel3.display();
        hotel1.input();
        ammountLakwood = hotel1.findAmmount();
        ammountBridgewood = hotel2.findAmmount();
        ammountRidgewood = hotel3.findAmmount();
        if (ammountLakwood > ammountBridgewood && ammountRidgewood > ammountBridgewood)
            System.out.println("The Hotel Bridgewood is the cheapest hotel. Requires ammount of "+ammountBridgewood+"$");
        else if(ammountLakwood<ammountRidgewood)
            System.out.println("The Hotel Lakewood is the cheapest hotel. Requires ammount of "+ammountLakwood+"$");
        else
            System.out.println("The Hotel Ridgewood is the cheapest hotel. Requires ammount of "+ammountRidgewood+"$");
    }
}
