/*. Write a program that can print the maximum number between two numbers,
if both are equal then print Equal
            Ex:
                n1= 100, n2 = 200;
            output:
                200 is the maximum number*/

package day08_IfStatement;

public class MaxNumber {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        boolean maximumNumber = num1 <= num2;
        if(maximumNumber){
            System.out.println(num2 + " is Maximum number");
        }



    }
}
