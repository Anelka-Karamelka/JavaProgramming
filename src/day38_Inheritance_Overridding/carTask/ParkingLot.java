package day38_Inheritance_Overridding.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota=new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla=new Tesla("Model S", 2021, 60000,"white", 1236475);

        BMW bmw=  new BMW("X5", 2020, 67350, "black", 12000);

        toyota.start();
        tesla.start();
        bmw.start();


    }
}
