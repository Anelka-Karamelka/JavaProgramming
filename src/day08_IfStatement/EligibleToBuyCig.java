/*
1. Given a number (byte) age, write a program that
can check if the person is eligible to buy Cigarettes
 */
package day08_IfStatement;

public class EligibleToBuyCig {

    public static void main(String[] args) {

        byte age = 21;
        boolean isEligibleToBuyCigarettes = age >= 20;

        if(isEligibleToBuyCigarettes){
            System.out.println("Eligible");
        }
    }
}
