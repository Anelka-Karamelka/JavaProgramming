package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age: ");
            int age = scan.nextInt();


            while (!(age >= 1 && age <= 120)) {  // while age is invalid
                System.err.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }
            System.out.println("Would you like continue?");
            String s = scan.next().toLowerCase();

            while (!(s.equals("yes") || s.equals("no"))) {
                System.out.println("Invalid entry, please re enter, would you like continue");
                s = scan.next().toLowerCase();
            }


            if (s.equals("no")) {
                break;
            }
scan.close();
        }
    }
}
