package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car("Toyota");

        Car car2=new Car("Honda", "Accord");

        Car car3=new Car("Lexus", "Rx350", 2020);

        Car car4=new Car("BMW", "X6", 2020, 50000);

        Car car5=new Car("Tesla", "Model3", 2019, 700000,"black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
