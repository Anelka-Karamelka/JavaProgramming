package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarry {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No ");
        String willYouMarry = scan.next();


        while (!willYouMarry.equals("yes") || willYouMarry.equals("no")){
            System.err.println("Invalid answer, please re-enter");
            willYouMarry = scan.next().toLowerCase();
        }

        if(willYouMarry.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }




        }
    }


/*
Task:
    1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */