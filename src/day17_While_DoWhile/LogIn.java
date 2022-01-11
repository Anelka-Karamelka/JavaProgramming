package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

      // user name: "Cydeo"
        // password: "Cydeo123"

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo") && p.equals("Cydeo123")){ //if credendials are valid/correct
            System.out.println("Logged in");
        }else{                                          // otherwise if credentials are not valid
            int attempts = 3;

            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0){//

                if(attempts ==1){
                    System.out.println("THIS IS YOUR LAST CHANCE"); // JUST REMIND
                }
                System.out.println("Invalid user name and password, please re enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                 p = scan.next();
                 attempts--;

            }
             if( u.equals("Cydeo") && p.equals("Cydeo123")){
                 System.out.println("You logged in");
             }else{
                 System.out.println("Your account is locked");
             }
        }

        scan.close();

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */