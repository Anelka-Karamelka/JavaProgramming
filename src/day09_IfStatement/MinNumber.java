/*
. Create a class called MinNumber,
Write a program that can print the minimum number between two numbers,
if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */
package day09_IfStatement;

public class MinNumber {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        boolean n1IsMin = num1<num2;
        boolean n2IsMin = num2<num1;
        boolean equal = num1==num2;
        if(n1IsMin){ //if num1 is minimum number
            System.out.println(num1+" is the minimum number");
        }
        if(n2IsMin){// if num2 is minimum number
            System.out.println(num2+ "is the minimum number");
        }
        if(equal){  //if num1 is equal to number2
            System.out.println("Equal");
        }

    }
}
