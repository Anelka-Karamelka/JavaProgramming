package day07_Operators;

public class ArithmaticOperators {


    public static void main(String[] args) {
        int num1 = 10;   //10 - numerator
        int num2 = 3;    // 3 -denomaninator

        int division = num1 / num2; // division variable contains the result of number of num 1 divides by num2
        int remainder = num1 % num2; //remainder variable contains the remainder of num1 the divided by num2

        // 10 divide by 3 is equal to 3 a remainder of 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

        // what is the remainder of 25 divided 4:

        System.out.println( 25 % 4);


    }
}
