/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import model.excepions.DomainExceptions;

/**
 *
 * @author Cert
 */
public class Program {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            System.out.println("Room number: ");
            int number = input.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(input.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(input.next());
            
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: "+reservation.toString());

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy)");
            checkIn = sdf.parse(input.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            checkOut = sdf.parse(input.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: "+reservation.toString());
        }
        catch(ParseException e){
            System.out.println("Invalid date format");
        }
        catch(DomainExceptions e){
            System.out.println("Error in reservation: "+e.getMessage());
        }
        input.close();
    }
}
