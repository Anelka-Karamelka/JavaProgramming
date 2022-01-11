package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:"); //nextLine
        String fullName = input.nextLine();


        System.out.println("Enter your building number:"); //next
        String buildingNum = input.next();

        input.nextLine();


        System.out.println("Enter street name:"); //nextLine
        String streetName = input.nextLine();


        System.out.println("Enter your city name:"); //nextLine
        String cityName = input.nextLine();


        System.out.println("Enter your state:");//next
        String stateName = input.next();


        System.out.println("Enter your zip code:"); //nextInt
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name:"); //n
        String countryName= input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("buildingNum = " + buildingNum);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);

        System.out.println("Shipping Address: " +"\n" + fullName + "\n" + buildingNum + ", " + streetName + ", " + cityName + "\n" + stateName + "\n" + zipCode);


        input.close();

    }
}
