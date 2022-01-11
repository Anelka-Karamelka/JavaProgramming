package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "12532D",
                streetName = "Jones Branch Dr",
                city = "Arlington",
                state = "Virginia",
                zipCode = "45425S";

     //   System.out.println(name"+ "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode;

        System.out.println(address);


    }

}

/*Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCod

 */