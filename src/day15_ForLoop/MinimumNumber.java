package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minNumber = 2147483647; //  any user entered number will be less than 2147483648;

        for (int i = 10; i < 15; i++) {

            System.out.println("Enter a number:");
            int number = scan.nextInt();//67,23,42,5,-10

            if (number < minNumber) {
                minNumber = number;
            }
        }
            System.out.println("minNumber = " + minNumber);


        }

    }




