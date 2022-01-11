package day09_IfStatement;

public class NameOfDay {

    public static void main(String[] args) {

        int num = 5; // 1~7

        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println("-----------------------------------");

        String day;

        if (num == 1) {
            day = "Monday";
        } else if (num == 2) {
            day = "Tuesday";
        } else if (num == 3) {
            day = "Wednesday";
        } else if (num == 4) {
            day = "Thursday";
        } else if (num == 5) {
            day = "Friday";
        } else if (num == 6) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }

        System.out.println("day = " + day);


    }

}

