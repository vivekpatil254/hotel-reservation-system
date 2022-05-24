package com.bridgelabz;

import javax.print.attribute.HashPrintJobAttributeSet;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel reservation System...");
        Hotel hotel1 = new Hotel("Lakewood",110);
        Hotel hotel2 = new Hotel("Bridgewood",160);
        Hotel hotel3 = new Hotel("Ridgewood",220);
        hotel1.display();
        hotel2.display();
        hotel3.display();
    }
}
