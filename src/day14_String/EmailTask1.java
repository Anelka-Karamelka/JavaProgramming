package day14_String;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = "mike";
        String lastName = "tyson";
        String emailName = "@gmail.com";

        System.out.println(firstName+"_"+lastName+emailName);

        String result1 = firstName.replace("mike", "tyson");
        String result2 = lastName.replace("tyson","mike");

        System.out.println(lastName+"_"+firstName+emailName);


    }
}

/*
. Create a class calledEmailTask1.
 Assume that email address is constructed by person's first name
 and followed by an underscore and last name.

 Write a program that can swap first name with last name in the email (Saperated by an underscore).
 If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tysonccc
                output: tyson_mike@gmail.com
 */