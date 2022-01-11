package day26_CustomMethodsPractice;

import java.sql.SQLOutput;

public class MathOperators {
    public static void main(String[] args) {

        int n1 = sumOfNumbers(40, 50);
        System.out.println("n1 = " + n1);

        System.out.println("-------------");

        double n2 = sumOfNumbers(8.9, 6.3);
        System.out.println("n2 = " + n2);

        int n3 = subtraction(50, 10);
        System.out.println("n3 = " + n3);

        double n4 = subtraction(10.5, 5.5);
        System.out.println("n4 = " + n4);

        System.out.println("--------------");
        int n5 = multiplication(10, 4);
        System.out.println("n5 = " + n5);

        double n6 = multiplication(50, 5);
        System.out.println("n6 = " + n6);

        double n7 = division(25, 5);
        System.out.println("n7 = " + n7);
        System.out.println("*********************");

        evenOrOdd(37);

        System.out.println("*************");

        int s1 = max(10, 5);
        System.out.println(s1);

        double s2=max(10.5,5.5);
        System.out.println(s2);

        int s3= min(6,3);
        System.out.println(s3);

       double s4 = min(6.3,3.3);
        System.out.println(s4);

    }

    // 			2.1 Create a method that can return the sum of two integers
    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    //2.2 Create a method that can return the sum of two decimal integers
    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //2.4 Create a method that can return the subtraction of two decimal integers
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // 2.5 Creat a method that can return the multiplication of two integers
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // 2.6 Creat a method that can return the multiplication of two decimal integers
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // 2.7 Create a method that passes two double parameters and return the division
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    //2.8 Create a method that can check if an integer is even number
    public static void evenOrOdd(int num1) {

        if (num1 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    //2.9 Create a method that can return the maximum number between two integers

    public static int max(int num1, int num2) {
      int max=0;

        if (num1 > num2) {
            max=num1;
        } else {
            max=num2;
        }
        return max;
    }
    //2.10 Create a method that can return the maximum number between two integers

    public static double max(double num1, double num2) {
        double max = 0;

        if (num1 > num2) {
         max=num1;
        } else {
            max = num2;
        }
            return max;

    }

    //2.11 Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2){

        int min= 0;

       if(num1<num2){
            min=num1;
        }else{
           min=num2;
       }
       return min;
    }
    //2.12 Create a method that can return the minimum number between two integers
    public static double min(double num1, double num2){

        double min= 0;

        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }
    //2.14 Create a method that can return the square of an integer
    public static int square(int number){
        return number*number;
    }
    //2.15 Create a method that can return the square of a double
    public static double square(double number){
        return number*number;
    }
    //2.16 Create a method that can return the cube of an integer
    public static int cube(int number){
        return number*number*number;
    }
	//2.17 Create a method that can return the cube of a double
    public static double cube(double number){
        return number*number*number;
    }


    }






