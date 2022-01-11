/*
 Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7  */

package day08_IfStatement;

public class NameOfTheDay {

    public static void main(String[] args) {

        int num = 6;
        boolean monday = num == 1;
        boolean tuesday = num == 2;
        boolean wednesday = num == 3;
        boolean thursday = num == 4;
        boolean friday = num == 5;
        boolean saturday = num == 6;
        boolean sunday = num ==7;

        if(monday) {
            System.out.println("Monday");
        }
        if(tuesday){
            System.out.println("Tuesday");
        }
        if(wednesday){
            System.out.println("Wednesday");
        }
        if(thursday){
            System.out.println("Thursday");
        }
        if(friday){
            System.out.println("Friday");
        }
        if(saturday){
            System.out.println("Friday");
        }
        if(sunday){
            System.out.println("Sunday");
        }
    }
}
