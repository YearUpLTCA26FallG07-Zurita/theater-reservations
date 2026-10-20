package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TheaterReservation {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String customerName = myScanner.nextLine();

        String[] fullName = customerName.split(" ");
        System.out.println(Arrays.toString(fullName));

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String movieDate = myScanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int ticketQuantity = myScanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(movieDate, formatter);

        if (ticketQuantity > 1){
            System.out.printf("%d tickets reserved for %s under %s, %s", ticketQuantity, reservationDate, fullName[1], fullName[0]);
        } else {
            System.out.printf("%d ticket reserved for %s under %s, %s", ticketQuantity, reservationDate, fullName[1], fullName[0]);
        }
    }
}
