package day09_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int number1 = 300;
        int number2 = 500;

        boolean num1IsMax = number1 < number2;
        boolean num2IsMax = number1 > number2;

        if (num1IsMax) {
            System.out.println(number2 + " is maximum number");
        } else {
            System.out.println(number1 + " is not maximum number");
        }
    }
}
