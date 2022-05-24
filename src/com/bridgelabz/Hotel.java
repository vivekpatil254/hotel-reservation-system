package com.bridgelabz;

public class Hotel {
    String hotelName;
    int regulerCustomerRate;
         public Hotel(String name, int rate)
            {
                hotelName=name;
                regulerCustomerRate=rate;
            }
   public void display()
   {
       System.out.println("\nHotel name            : "+hotelName);
       System.out.println("Reguler Customer rate : "+regulerCustomerRate);
   }


}
