package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;
        // int kingBed = 120, queenBed = 100, singleBed = 80;

        while (true) {
            System.out.println("Which bedroom do you want to reserve?");
            String bedRoom = scan.nextLine().toLowerCase();

            while (!(bedRoom.equals("King Bed") || bedRoom.equals("Queen Bed")
                    || bedRoom.equals("Single Bed"))) {
                System.out.println("Invalid entry, please re enter?");
                bedRoom = scan.next().toLowerCase();

            }

            System.out.println("How many nights are you staying?");
            int nights = scan.nextInt();
            if (bedRoom.equals("King Bed")) {
                totalPrice += 120 * nights;
            } else if (bedRoom.equals("Queen Bed")) {
                totalPrice += 100 * nights;
            } else {
                totalPrice += 80 * nights;
            }
            while (!(nights > 0)) {
                System.out.println("Invalid entry, please re enter?");
            }

            System.out.println("Would you like to reserve another room?");
            String answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, please re enter?");
            }
            if (answer.equals("no")) {
                break;
            }
            
        }

        System.out.println("totalPrice = " + totalPrice);
    }
}

/*
 Create a class called RoomReservation, write a program for the room reservation:
   King Bed ==> 120$
    Queen Bed ==> 100$
    single Bed ==> 80$

  the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
  Then Ask the user "would you like to reserve another room?""
  if yes ==> repeat the entire steps
 if no ==> return the  total price

If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
