package com.bridgelabz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservationMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel reservation System...");
        List<Hotel> hotelList = new ArrayList<Hotel>();
        hotelList.add(new Hotel("Lakewood", 180));
        hotelList.add(new Hotel("Bridgewood", 160));
        hotelList.add(new Hotel("Ridgewood", 220));
        hotelList.forEach(hotel -> {
            hotel.display();
        });


        LocalDate fromDateObject;
        LocalDate toDateObject;
        try {
            System.out.println("Enter the start date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
            fromDateObject = LocalDate.parse(scanner.next());
            System.out.println("Enter the end date to book : \n NOTE - The date should be in given formatte 'YYYY-MM-DD'");
            toDateObject = LocalDate.parse(scanner.next());
            long dayCount = countDays(fromDateObject, toDateObject);
            hotelList.forEach(hotel -> {
                hotel.findAmmount(dayCount);
            });
        } catch (Exception e) {
            System.out.println("exception genrated " + e);
        }
        Optional<Hotel> cheapHotel = hotelList.stream().collect(Collectors.minBy(Comparator.comparing(Hotel::getTotalAmmount)));
        System.out.println("the chepest hotel is '" + cheapHotel.get().getHotelName() + "' and it costs '" + cheapHotel.get().getTotalAmmount() + "'");
    }

    public static long countDays(LocalDate fromDateObject, LocalDate toDateObject) {
        long numberOfDays = 0;
        numberOfDays = ChronoUnit.DAYS.between(fromDateObject, toDateObject);
        System.out.println(numberOfDays);
        return numberOfDays;
    }
}