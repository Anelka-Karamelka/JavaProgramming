package practice_12_08_2021;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /* Write a program that can return the factorial number of any given number

   Ex:
   input: 5
  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
   // another ex          4! = 4 * 3 * 2* 1
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        int number = scan.nextInt();
        int result =1;


       if(number>2){
           for (int i=number; i>=1; i--){
               result *=i;   //resule = result *i  5*
           }
       }else{
           result=number;
       }

        System.out.println("Factorial number is: " + result);
scan.close();
    }

}
