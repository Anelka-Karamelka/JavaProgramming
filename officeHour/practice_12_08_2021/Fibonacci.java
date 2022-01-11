package practice_12_08_2021;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
 /* Create a program that will give you the Fibonacci numbers up to the x value.

  Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

  Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1,
  2nd value is 1, etc

  Ex:
 Input: 8
 Output:
  0, 1, 1, 2, 3, 5, 8, 13, 21 */
        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci do u want to see?");
        int number = input.nextInt();
        int num0=0;
        int num1=1;
        int result=0;

        System.out.println(num0); //0
        System.out.println(num1); //1

        for (int i=2; i<number; i++){  // i =2 (because we already have 2 index already(0,1)
            result = num0+num1; //0+1=1
            System.out.println(result);
            num0=num1;
            num1=result;

        }




    }
}


